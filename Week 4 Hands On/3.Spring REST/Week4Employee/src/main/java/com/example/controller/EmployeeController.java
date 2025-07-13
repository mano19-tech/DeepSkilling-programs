package com.example.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee-config.xml");

    @GetMapping
    public List<Employee> getEmployees() {
        return (List<Employee>) context.getBean("employeeList");
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        List<Employee> list = (List<Employee>) context.getBean("employeeList");
        return list.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
    }
}

