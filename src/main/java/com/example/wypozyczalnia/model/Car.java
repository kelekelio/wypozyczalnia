package com.example.wypozyczalnia.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;
    private String body;
    private Integer year;
    private String color;
    private Long millage;
    private Integer status;
    private Integer available;
    private Double price;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "car")
    private Set<Reservation> reservations = new HashSet<Reservation>();



    public Car() {
    }

    public Car(Long id, String make, String model, String body, Integer year, String color, Long millage, Integer status, Integer available, Double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.body = body;
        this.year = year;
        this.color = color;
        this.millage = millage;
        this.status = status;
        this.available = available;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getMillage() {
        return millage;
    }

    public void setMillage(Long millage) {
        this.millage = millage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
