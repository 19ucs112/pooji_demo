package com.prani.training.request.inheritance;

public class Automobile {
    private String name;
    private String company;
    private int numberOfWheels;


    public Automobile() {

    }

    public Automobile(String name, String company, int numberOfWheels) {
        this.name = name;
        this.company = company;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    //method overriding
    public void printStatus() {
        System.out.println("I am in parent class");
    }
}
