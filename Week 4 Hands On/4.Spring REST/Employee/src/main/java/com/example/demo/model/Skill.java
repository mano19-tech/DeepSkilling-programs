package com.example.demo.model;

import jakarta.validation.constraints.*;

public class Skill {

    @NotNull
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    // getters and setters
}
