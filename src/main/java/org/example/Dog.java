package org.example;

public class Dog {
    String name;
    int age;

    public Dog(){

    }

    public Dog(String name){
        this.name = name;
    }
//s
    public Dog(int age){
        this.age = age;
    }

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
}
