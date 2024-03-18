package org.example.dbconfig;

import lombok.Data;
import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.TreeMap;

@Data
public class DBConfig {
    private final TreeMap<Long, Employee> employeeList = new TreeMap<>();

    private final TreeMap<Long, Department> departmentList = new TreeMap<>();
}
