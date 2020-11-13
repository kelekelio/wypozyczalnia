package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.DTO.CarDto;
import com.example.wypozyczalnia.mappers.CarMapper;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Grzegorz Nowakowski
 */
@Service
public class CarService {

    @Autowired
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void save (Car car) {
        carRepository.save(car);
    }

    public Car get(Long id) {
        return carRepository.findById(id).get();
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    public void deleteById (Long id) {
        carRepository.deleteCarById(id);
    }


    public List<Car> listAll() {
        return carRepository.findAll();
    }

    public List<Car> listAllAvailableCars() {
        return carRepository.findAllAvailableCars();
    }

    public List<Car> listAllCarsByBranch(Long id) {
        return carRepository.findAllCarsByBranch(id);
    }

    public List<CarDto> findAllCarForBranch(final String branchId) throws NumberFormatException {
        Long branchIdLong = Long.parseLong(branchId);
        return findAllCarForBranch(branchIdLong);
    }

    public List<CarDto> findAllCarForBranch(final Long branchId) {
        List<CarDto> branchCars = carRepository.findByBranchId(branchId)
                .stream().map(c -> CarMapper.INSTANCE.carToDto(c)).collect(Collectors.toList());
        return branchCars;
    }
}
