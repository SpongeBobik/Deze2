package com.example.deze2.Zadanie2;

public class Horce extends Animal{

    String name;
    public Horce(String food, String location, String name) {
        super(food, location);
        this.name = name;

    }

    public void makeNoise(){
        System.out.println("Igogo igogo");

    }
    public void eat() {
        System.out.println("Horse sleeping");
    }


}
