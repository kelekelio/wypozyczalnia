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
    private LocalDate from;
    private LocalDate to;

    private Double price;
    @ManyToMany
    Set<Branch> branches;
//    private Branch pickUp;
//    private Branch dropOff;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation_id")
    private Car car;

    public Reservation() {
    }

    public Reservation(Long id, LocalDate reservationDate, LocalDate from, LocalDate to, Double price, Set<Branch> branches, Car car) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.from = from;
        this.to = to;
        this.price = price;
        this.branches = branches;
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

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
