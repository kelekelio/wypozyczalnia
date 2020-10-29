package com.example.wypozyczalnia.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private String reservationDate;
    //private Client client;
    private String fromDate;
    private String toDate;
    @OneToOne
private Branch pickUpBrunch;
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

    public Reservation(Long id, String reservationDate, String fromDate, String toDate, Double price, Set<Branch> branches, Car car) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
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

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
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
