package com.prani.training.request.abstraction;

public class Executable {
    public static void main(String[] args) {
        Human human = new Men();
        System.out.println(human.hasMoustache());
    }
}
