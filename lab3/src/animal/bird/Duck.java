package animal.bird;

import java.util.Objects;

public class Duck extends Bird {
    private int length;

    public Duck(int noOfLegs, String nume, String color, int length){
        super(nume,noOfLegs,color);
        this.length = length;
    }

    @Override
    public void move(){
        System.out.println("idk im a duck");
    }

    @Override
    public void sing() {
        System.out.println("mac mac");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Duck duck = (Duck) o;
        return length == duck.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }
}
