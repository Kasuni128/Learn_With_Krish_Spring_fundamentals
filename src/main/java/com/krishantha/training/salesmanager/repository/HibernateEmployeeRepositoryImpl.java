package com.krishantha.training.salesmanager.repository;
import com.krishantha.training.salesmanager.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
public class HibernateEmployeeRepositoryImpl implements EmployeeRepositoryImpl, EmployeeService {
    List<Employee> employees = new ArrayList();
    Employee employee = new Employee();

    public HibernateEmployeeRepositoryImpl() {
    }

    public List<Employee> getAllEmployees() {
        this.employee.setEmaployeeName("Kasuni");
        this.employee.setEmployeeLocation("Udawalawa");
        this.employees.add(this.employee);
        return this.employees;
    }
}
