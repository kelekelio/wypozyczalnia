package com.example.wypozyczalnia.repository;

import com.example.wypozyczalnia.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Grzegorz Nowakowski
 */
public interface CarRepository extends JpaRepository<Car, Long>  {
}
