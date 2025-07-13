package com.cognizant.spring_rest2;

import com.cognizant.spring_rest2.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    // Simple GET request
    @GetMapping("/greet")
    public String greet() {
        return "Welcome to REST API!";
    }

    // GET request returning JSON object
    @GetMapping("/student")
    public Student getStudent() {
        return new Student(101, "Alice");
    }

    // GET request with PathVariable
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return new Student(id, "Student #" + id);
    }

    // GET request returning an array (List)
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(101, "Alice"),
                new Student(102, "Bob"),
                new Student(103, "Charlie")
        );
    }
}
