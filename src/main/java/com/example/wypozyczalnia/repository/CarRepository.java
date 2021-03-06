package com.example.wypozyczalnia.repository;

import com.example.wypozyczalnia.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
public interface CarRepository extends JpaRepository<Car, Long>  {


    @Query("SELECT F FROM Car F WHERE F.available = 1")
    List<Car> findAllAvailableCars();

    @Query("SELECT F FROM Car F WHERE F.branch.id = ?1")
    List<Car> findAllCarsByBranch(Long id);

    List<Car> findByBranchId(final Long branchId);

    @Transactional
    @Modifying
    @Query("DELETE FROM Car C WHERE C.id = :id")
    void deleteCarById(@Param("id") Long id);
}
