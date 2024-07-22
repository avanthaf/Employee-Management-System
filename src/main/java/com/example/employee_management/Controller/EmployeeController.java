package com.example.employee_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management.Model.Employee;
import com.example.employee_management.Services.EmployeeServices;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeServices.getAllEmployees();
    }

    @GetMapping("/{ID}")
    public Employee getEmployeeById(Long id){
        return employeeServices.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(Employee employee){
        return employeeServices.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeServices.getEmployeeById(id);
        if (existingEmployee != null) {
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setDepartmentName(employee.getDepartmentName());
            existingEmployee.setRole(employee.getRole());
            return employeeServices.saveEmployee(existingEmployee);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeServices.deleteEmployee(id);
    }
}