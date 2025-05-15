package com.prani.training.request.inheritance;

public class Dog implements IAnimal, IForest {

    @Override
    public String getSound() {
        return "bow bow";
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping");
    }

    @Override
    public String getForestName() {
        return "Amazon";
    }
}
