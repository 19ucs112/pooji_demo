package com.prani.training.request;

public class Employee {
    private String id;
    private String name;
    private Double salary;
    private String department;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = "acc@" + id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    //accenture -> acc@1
}
