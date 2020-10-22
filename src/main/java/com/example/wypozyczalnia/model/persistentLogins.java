package com.example.wypozyczalnia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Grzegorz Nowakowski
 */

/**
Purely for table creation
 */

@Entity
@Table(name = "persistent_logins")
public class persistentLogins {

    @Column(nullable = false, length = 50)
    private String username;

    @Id
    @Column(nullable = false, length = 64)
    private String series;

    @Column(nullable = false, length = 64)
    private String token;

    @Column(nullable = false)
    private java.sql.Timestamp last_used;


}
