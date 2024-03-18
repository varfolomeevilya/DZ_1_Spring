package org.example.service;

import org.example.dao.AppDao;
import org.example.dao.DAO;
import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.TreeMap;

public class Service implements ServiceAll{
    private final DAO dao = new AppDao();
    @Override
    public void addEmployee(Employee employee){
        dao.addEmployee(employee);
    }
    @Override
    public void updateEmployeeName(Employee employee, String name){
        dao.updateEmployeeName(employee, name);
    }

    @Override
    public void updateEmployeeSurname(Employee employee, String surname){
        dao.updateEmployeeSurname(employee, surname);
    }
    @Override
    public void updateEmployeeSalary(Employee employee, Long salary){
        dao.updateEmployeeSalary(employee, salary);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        dao.deleteByEmployeeId(id);
    }

    @Override
    public void addDepartment(Department department){
        dao.addDepartment(department);
    }

    @Override
    public void updateDepartmentName(Department department, String DepartmentName){
        dao.updateDepartmentName(department, DepartmentName);
    }
    @Override
    public void deleteDepartmentById(Long id) {
        dao.deleteByDepartmentId(id);
    }

    @Override
    public TreeMap<Long, Employee> getAllEmployee() {
        return dao.getAllEmployee();
    }

    @Override
    public TreeMap<Long, Department> getAllDepartment() {
        return dao.getAllDepartment();
    }
}
