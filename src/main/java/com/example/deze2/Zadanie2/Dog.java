package com.example.deze2.Zadanie2;

public class Dog extends Animal {

    String color;
    public Dog (String food, String location, String color) {
        super(food, location);

        this.color = color;
    }

    public void makeNoise() {
        System.out.println("Gav gav");
    }

    public void eat() {
        System.out.println("Dog eating");
    }

}
