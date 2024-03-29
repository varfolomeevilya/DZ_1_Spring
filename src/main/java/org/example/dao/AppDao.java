package org.example.dao;

import org.example.dbconfig.DBConfig;
import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.TreeMap;

public class AppDao implements DAO {
    private final DBConfig dbConfig = new DBConfig();
    @Override
    public void addEmployee(Employee employee) {
    dbConfig.getEmployeeList().put(employee.getId(), employee);
    }

    @Override
    public void updateEmployeeName(Employee employee, String name) {
    employee.setName(name);
    }

    @Override
    public void updateEmployeeSurname(Employee employee, String surname) {
     employee.setSurname(surname);
    }

    @Override
    public void updateEmployeeSalary(Employee employee, Long salary) {
     employee.setSalary(salary);
    }

    @Override
    public void deleteByEmployeeId(long id) {
    dbConfig.getEmployeeList().remove(id);
    }

    @Override
    public void addDepartment(Department department) {
     dbConfig.getDepartmentList().put(department.getId(),department);
    }

    @Override
    public void updateDepartmentName(Department department, String departmentName) {
     department.setDepartmentName(departmentName);
    }

    @Override
    public void deleteByDepartmentId(long id) {
     dbConfig.getDepartmentList().remove(id);
    }

    @Override
    public TreeMap<Long, Employee> getAllEmployee() {
        return dbConfig.getEmployeeList();
    }

    @Override
    public TreeMap<Long, Department> getAllDepartment() {
        return dbConfig.getDepartmentList();
    }
}
