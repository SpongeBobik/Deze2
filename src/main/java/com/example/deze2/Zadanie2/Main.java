package com.example.deze2.Zadanie2;

import com.example.deze2.Zadanie1.Aspirant;
import com.example.deze2.Zadanie1.Student;

public class Main {
    public static void main(String[] args){

        Veterinar Veterinar = new Veterinar();
        Dog Dog1 = new Dog("Мясо", "Владимир", "Черный");
        Cat Cat1 = new Cat("Рыба", "Собинка", "Британец");
        Horce Horce1 = new Horce("Овес", "Владикавказ", "Бобик");

        Animal[] animals = {Dog1, Cat1, Horce1};

        for (Animal s : animals)
            Veterinar.treatAnimal(s);


    }
}
