package animal.bird;

import animal.Animal;

import java.sql.SQLOutput;
import java.util.Objects;

public class Bird extends Animal {
    private String color;
    public Bird(String name, int noOfLegs, String color){
        super(name,noOfLegs);
        this.color = color;
    }

    @Override
    public void move(){
        System.out.println("I can fly!");
    }

    public void sing(){
        System.out.println("bird sound idk");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(color, bird.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
