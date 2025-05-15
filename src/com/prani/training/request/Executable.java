package com.prani.training.request;

public class Executable {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("prani");
        employee.setId("1");
        employee.setSalary(1000000.0);
        employee.setDepartment("backend");

        System.out.println(employee.getName() + " " + employee.getId() + " " + employee.getSalary() + " " + employee.getDepartment());
    }
}
