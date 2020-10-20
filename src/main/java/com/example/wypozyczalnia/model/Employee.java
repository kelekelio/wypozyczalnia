package com.example.wypozyczalnia.model;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String position;
    private String branch;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String position, String branch) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String imie) {
        this.firstName = imie;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String nazwisko) {
        this.lastName = nazwisko;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String stanowisko) {
        this.position = stanowisko;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String oddzial) {
        this.branch = oddzial;
    }
}
