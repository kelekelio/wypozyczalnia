package com.example.wypozyczalnia.model;

import java.time.LocalDate;

/**
 * @author Grzegorz Nowakowski
 */
public class Reservation {
    private LocalDate reservationDate;
    private Client client;
    private Car car;
    private LocalDate from;
    private LocalDate to;
    private Branch pickUp;
    private Branch dropOff;
    private Double price;

    public Reservation() {
    }

    public Reservation(LocalDate reservationDate, Client client, Car car, LocalDate from, LocalDate to, Branch pickUp, Branch dropOff, Double price) {
        this.reservationDate = reservationDate;
        this.client = client;
        this.car = car;
        this.from = from;
        this.to = to;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
        this.price = price;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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

    public Branch getPickUp() {
        return pickUp;
    }

    public void setPickUp(Branch pickUp) {
        this.pickUp = pickUp;
    }

    public Branch getDropOff() {
        return dropOff;
    }

    public void setDropOff(Branch dropOff) {
        this.dropOff = dropOff;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
