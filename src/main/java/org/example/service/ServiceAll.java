package org.example.service;

import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.TreeMap;

public interface ServiceAll {
    void addEmployee(Employee employee);

    void updateEmployeeName(Employee employee, String name);

    void updateEmployeeSurname(Employee employee, String surname);

    void updateEmployeeSalary(Employee employee, Long salary);

    void deleteEmployeeById(Long id);

    void addDepartment(Department department);

    void updateDepartmentName(Department department, String departmentName);

    void deleteDepartmentById(Long id);

    TreeMap<Long, Employee> getAllEmployee();

    TreeMap<Long, Department> getAllDepartment();
}
