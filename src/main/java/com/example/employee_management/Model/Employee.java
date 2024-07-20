package com.example.employee_management.Model;

public class Employee {
    Long id;
    String employeeName;
    String departmentName;
    String role;

    public Employee(Long id, String employeeName, String departmentName, String role) {
        this.id = id;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
