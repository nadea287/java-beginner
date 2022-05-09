package com.company;

public class Human {
    //create a constructor within the class

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat()
    {
        //to access object's attributes within its own class - we have to use "this."
        System.out.println(this.name + " is eating");
    }
}
