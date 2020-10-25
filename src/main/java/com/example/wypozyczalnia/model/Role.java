package com.example.wypozyczalnia.model;

import javax.persistence.*;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="role_id")
    private long id;

    @Column(name="role")
    private String role;

    public Role() {
    }

    public Role(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
