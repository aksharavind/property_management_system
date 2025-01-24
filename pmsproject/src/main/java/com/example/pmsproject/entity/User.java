package com.example.pmsproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Maps this entity to the existing "users" table in the database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates and increments ID
    @Column(name = "id") // Maps to the 'id' column in your database
    private Long id;

    @Column(name = "username", nullable = false, unique = true) // Maps to the 'username' column
    private String username;

    @Column(name = "password", nullable = false) // Maps to the 'password' column
    private String password;

    @Column(name = "phone_number", nullable = false, unique = true) // Maps to the 'phone_number' column
    private String phoneNumber;

    // Default constructor
    public User() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

