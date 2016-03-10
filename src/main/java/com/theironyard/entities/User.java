package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by noellemachin on 3/9/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true) //unique means that each username cannot be duplicated
    String name;

    @Column(nullable = false)
    String passwordHash;

    public User(String name, String passwordHash) {
        this.name = name;
        this.passwordHash = passwordHash;
    }

    public User() {
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
