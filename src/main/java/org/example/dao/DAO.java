package org.example.dao;

import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.HashMap;


public interface DAO {
    void addEmployee(Employee employee);

    void updateEmployeeName(Employee employee, String name);
    void updateEmployeeSurname(Employee employee, String surname);

    void updateEmployeeSalary(Employee employee, Long salary);

    void deleteByEmployeeId(long id);

    void addDepartment(Department department);
    void updateDepartmentName(Department department, String departmentName);
    void deleteByDepartmentId(long id);
    HashMap<Long, Employee>getAllEmployee();
   HashMap<Long, Department> getAllDepartment();
}
