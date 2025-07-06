package com.example.ormapping.entity;

import com.example.ormapping.entity.Employee;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    // Getters and Setters
}
