package com.example.wypozyczalnia.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate reservationDate;
    //private Client client;
    private LocalDate fromDate;
    private LocalDate toDate;

    private Double price;

    @OneToOne
    @JoinColumn(name = "pickupBranchId")
    private Branch pickupBranch;

    @OneToOne
    @JoinColumn(name = "dropOffBranchId")
    private Branch dropOffBranch;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id")
    private Car car;

    public Reservation() {
    }

    public Reservation(Long id, LocalDate reservationDate, LocalDate fromDate, LocalDate toDate, Double price, Branch pickupBranch, Branch dropOffBranch, Car car) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.price = price;
        this.pickupBranch = pickupBranch;
        this.dropOffBranch = dropOffBranch;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Branch getPickupBranch() {
        return pickupBranch;
    }

    public void setPickupBranch(Branch pickupBranch) {
        this.pickupBranch = pickupBranch;
    }

    public Branch getDropOffBranch() {
        return dropOffBranch;
    }

    public void setDropOffBranch(Branch dropOffBranch) {
        this.dropOffBranch = dropOffBranch;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
