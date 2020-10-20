package com.example.wypozyczalnia.model;

import javax.persistence.*;

@Entity
@Table
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String town;
    private Integer houseNo;
    private String street;
    private String postCode;

    public Branch() {
    }

    public Branch(Long id, String town, Integer houseNo, String street, String postCode) {
        this.id = id;
        this.town = town;
        this.houseNo = houseNo;
        this.street = street;
        this.postCode = postCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
