package com.example.employee_management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_management.Model.Employee;
import com.example.employee_management.Repository.EmployeeRepository;

@Service
public class EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee savEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    
}
