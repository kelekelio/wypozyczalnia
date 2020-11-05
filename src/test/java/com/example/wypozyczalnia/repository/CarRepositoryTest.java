package com.example.wypozyczalnia.repository;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarRepositoryTest {

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private CarRepository carRepository;

    @Test
    public void findCarsByBranchId() {

        Branch branch = branchRepository.save(new Branch(null, "Londyn", 2, "Kwadrat", "Rynek 29"));

        Car car1 = new Car(null,
                "Ford",
                "Kuga",
                "SUV",
                2020,
                "green",
                1L,
                1,
                1,
                50.0d);
        car1.setBranch(branch);
        carRepository.save(car1);

        List<Car> carsFromSelectedBranch = carRepository.findByBranchId(branch.getId());
        assertNotNull(carsFromSelectedBranch);
    }
}