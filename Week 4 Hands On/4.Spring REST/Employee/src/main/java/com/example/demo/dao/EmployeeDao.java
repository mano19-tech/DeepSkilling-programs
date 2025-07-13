package com.example.demo.dao;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    private static List<Employee> employeeList = new ArrayList<>();

    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee with id " + employee.getId() + " not found.");
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        boolean removed = employeeList.removeIf(emp -> emp.getId().equals(id));
        if (!removed) {
            throw new EmployeeNotFoundException("Employee with id " + id + " not found.");
        }
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addSampleEmployee(Employee emp) {
        employeeList.add(emp);
    }
}
