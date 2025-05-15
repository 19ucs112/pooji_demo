package com.prani.training.request.inheritance;

/*
    * Here the car class is extending Automobile class and implementing IForest interface.
    * So any Car class object that is instantiated will get all the properties and methods of Automobile class and can
    * access the implementations of the IForest interface methods
 */

public class Car extends Automobile implements IForest {
    private int model;
    private String version;
    private String color;
    private String engine;

    //ambiguity restricts java classes to extend multiple java classes

    public Car() {

    }

    public Car(int model, String version, String color, String engine, String name, String company, int numberOfWheels) {
        super(name, company, numberOfWheels);
        //Super keyword calls the constructor of the parent class.
        this.model = model;
        this.version = version;
        this.color = color;
        this.engine = engine;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getModel() {
        return model;
    }

    public String getVersion() {
        return version;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    /*same method is defined in the super class also, but if you define the same method as super class in child class
    the child class method overrides the super class method*/
    public void printStatus() {
        System.out.println("I am in child class");
    }

    @Override
    public String getForestName() {
        System.out.println("I am in implementation method");
        int a = 5;
        int b = 5+4;
        System.out.println(a + b);
        return "Dense Forest";
    }
}
