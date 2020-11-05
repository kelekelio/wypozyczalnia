package com.example.wypozyczalnia;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.repository.BranchRepository;
import com.example.wypozyczalnia.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class WypozyczalniaApplication {

    public static void main(String[] args) {

        int numberOfCars;
        SpringApplication.run(WypozyczalniaApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BranchRepository branchRepository,
                                   CarRepository carRepository) {
        return args -> {

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
        };
    }

}
