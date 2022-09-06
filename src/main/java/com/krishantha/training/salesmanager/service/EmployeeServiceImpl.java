package com.krishantha.training.salesmanager.service;
import com.krishantha.training.salesmanager.repository.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepositoryImpl repository = new HibernateEmployeeRepositoryImpl();

    public EmployeeServiceImpl() {
    }

    public List<Employee> getAllEmployees() {
        return this.repository.getAllEmployees();
    }
}