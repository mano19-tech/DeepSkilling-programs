package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a REST controller
public class HelloController {

    @GetMapping("/") // Maps the root URL (http://localhost:8080/)
    public String home() {
        return "Welcome to My Spring Boot Application!";
    }
}
