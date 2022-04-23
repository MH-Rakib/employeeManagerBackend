package com.mhr.employeeManager.service;

import com.mhr.employeeManager.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

    Employee findById(Long id);
}
