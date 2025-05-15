package com.prani.training.request.inheritance;

import java.util.Scanner;

public class Executable {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("prani's car");
        car.setCompany("Audi");
        car.setNumberOfWheels(4);
        car.setColor("black");
        car.setEngine("12345gdfwr");
        car.setModel(2004);
        System.out.print("Enter car version: ");
        car.setVersion(new Scanner(System.in).next());
        System.out.println(car.getVersion() + " "
                + car.getEngine() + " " + car.getModel() + " " + car.getColor());
        car.printStatus();

        Car allArgumentTest = new Car(2024, "A5", "white", "engine#1", "prani's car",
                "bmw", 4);
        System.out.println(allArgumentTest.getEngine() + " " + allArgumentTest.getModel() + " "
                + allArgumentTest.getColor());

        //interfaces and implementations

        /*
        *** Here we are collecting the Cat class instance in the variable animal of type IAnimal, so we cannot directly
        *** access all the methods that are defined inside the Cat class, we can only access the methods that are
        *** implemented from the Interface IAnimal
        * */

        IAnimal animal = new Cat(); //animal = cat@1234%#
        System.out.println(animal.getSound());
        animal.sleep();

        IAnimal dog = new Dog();
        System.out.println(dog.getSound());
        dog.sleep();


        Cat cat1 = new Cat();
        System.out.println(cat1.getSound());
        System.out.println(cat1.getForestName());
        cat1.sleep();

        Dog newDog = new Dog();
        System.out.println(newDog.getSound());
        newDog.sleep();
        System.out.println(newDog.getForestName());

        IForest forest = new Dog();
        System.out.println(forest.getForestName());


        /*Here we are collecting instance of Car class in variable forest2 which is of type IForest, so we cannot
        directly access all methods defined inside Car class or it's super class. We can only access methods that are
        implemented from the IForest Interface*/
        IForest forest2 = new Car(2024, "A5", "white", "engine#1", "prani's car",
                "bmw", 4);
        System.out.println(forest2.getForestName());
    }
}
