package com.prani.training.request;

public class Student {

    public String getCountryName(String phone) {
        if (phone.startsWith("+91")) {
            return "IN";
        } else {
            return "US";
        }
    }

    public static String  getCountryName(String state, String district) {
        if ("GU".equals(district) && "HR".equals(state)) {
            return "IN";
        } else {
            return "US";
        }// static method, this can be called without initializing student class
    }

    public Student() {
       //empty student object with no values set
       //NoArgumentConstructor
    }
    public Student(String name, int age, String district, String phone, String city, String state) {
        this.name = name;
        this.age = age;
        this.district = district;
        this.phone = phone;
        this.city = city;
        this.state = state;
        //AllArgumentConstructor
    }
    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        //CustomArgumentConstructor
    }
    public String name;
    public int age;
    public String phone;
    public String city;
    public String state;
    public String district;
    //if we create a class in java it by default generates a default no argument constructor
    //constructor overloading
}

//Main class -> Student student = new Student("prani", 20, ..);
//student (no value) ->


