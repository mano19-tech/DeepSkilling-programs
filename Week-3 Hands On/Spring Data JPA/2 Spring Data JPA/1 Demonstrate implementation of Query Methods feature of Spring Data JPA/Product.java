package com.example.springdatajpa.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private LocalDate createdDate;

    // Getters and Setters
}
