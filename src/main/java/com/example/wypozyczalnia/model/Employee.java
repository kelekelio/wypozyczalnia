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

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "id" )
//    //Repeated column in mapping for entity: com.example.wypozyczalnia.model.Employee column: id (should be mapped with insert="false" update="false")
//    private Branch branch;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
