package com.prani.training.request.inheritance;

public class Cat implements IAnimal, IForest {

    @Override
    public String getSound() {
        return "Meoww Meoww";
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public String getForestName() {
        return "NallaMala";
    }
}
