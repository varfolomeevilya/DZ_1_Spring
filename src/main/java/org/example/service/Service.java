package org.example.service;

import org.example.dao.DAOImpl;
import org.example.dao.DAO;
import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.HashMap;

public class Service implements ServiceImpl {
    private final DAO dao = new DAOImpl();
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
    public HashMap<Long, Employee> getAllEmployee() {
        return dao.getAllEmployee();
    }

    @Override
    public HashMap<Long, Department> getAllDepartment() {
        return dao.getAllDepartment();
    }
}
