package com.example.deze2.Zadanie2;

public class Cat extends Animal {
    String race;

    public Cat(String food, String location, String race) {
        super(food, location);
        this.race = race;
    }

    public void makeNoise() {
        System.out.println("Meow meow");
    }

    public void eat() {
        System.out.println("Cat eating");
    }

}
