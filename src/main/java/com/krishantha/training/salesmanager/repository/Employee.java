package com.krishantha.training.salesmanager.repository;

public class Employee {
    private String emaployeeName;
    private String employeeLocation;

    public Employee() {
    }

    public String getEmaployeeName() {
        return this.emaployeeName;
    }

    public void setEmaployeeName(String emaployeeName) {
        this.emaployeeName = emaployeeName;
    }

    public String getEmployeeLocation() {
        return this.employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }
}
