package com.example.ormapping.controller;

import com.example.ormapping.entity.Department;
import com.example.ormapping.entity.Employee;
import com.example.ormapping.entity.Project;
import com.example.ormapping.repository.DepartmentRepository;
import com.example.ormapping.repository.EmployeeRepository;
import com.example.ormapping.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private ProjectRepository projectRepo;

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return departmentRepo.findAll();
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projectRepo.findAll();
    }
}
