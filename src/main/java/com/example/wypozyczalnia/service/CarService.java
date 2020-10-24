package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Car> listAll() {
        return carRepository.findAll();
    }
}
