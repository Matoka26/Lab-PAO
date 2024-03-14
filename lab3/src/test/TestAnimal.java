package test;

import animal.bird.Duck;
import animal.bird.Bird;

public class TestAnimal {
    public static void main(String[] args){
        Bird animal = new Duck(2, "pasarica","red", 2);
        animal.eat();
    }
}


