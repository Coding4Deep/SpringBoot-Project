package com.example.demo.model;

import jakarta.persistence.*;

@Entity // Marks this class as a database entity (table)
@Table(name = "users") // Table name in the database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    private String name;
    private String email;

    // Default constructor (required by JPA)
    public User() {}

    // Constructor with parameters
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters (Needed for data access)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
