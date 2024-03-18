package org.example;

import org.example.entity.Department;
import org.example.entity.Employee;
import org.example.service.Service;

public class Main1 {
    public static void main(String[] args){
        Department department = new Department();
        Department department1 = new Department();

        Employee employee = new Employee();
        Employee employee1 = new Employee();

        Service service = new Service();

        service.addEmployee(employee);
        service.addEmployee(employee1);

        service.addDepartment(department);
        service.addDepartment(department1);

        System.out.println(service.getAllEmployee());
        System.out.println(service.getAllDepartment());

        service.updateEmployeeSurname(employee,"Varfolomeev");
        System.out.println(service.getAllEmployee());
    }
}
