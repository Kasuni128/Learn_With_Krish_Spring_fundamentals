package com.krishantha.training.salesmanager.model;

import java.util.List;
import com.krishantha.training.salesmanager.repository.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import java.util.Iterator;

public class ModelApplication {
    public ModelApplication() {
    }

    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        List<Employee> employees = service.getAllEmployees();
        Iterator var3 = employees.iterator();

        while(var3.hasNext()) {
            Employee employee = (Employee)var3.next();
            System.out.println(employee.getEmaployeeName() + " at " + employee.getEmployeeLocation());
        }

    }
}
