package org.example.dbconfig;

import lombok.Data;
import org.example.entity.Department;
import org.example.entity.Employee;

import java.util.HashMap;
import java.util.TreeMap;

@Data
public class DBConfig {
    private final HashMap<Long, Employee> employeeList = new HashMap<>();

    private final HashMap<Long, Department> departmentList = new HashMap<>();
}
