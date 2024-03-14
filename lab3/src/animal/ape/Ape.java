package animal.ape;

import animal.Animal;

import java.util.Objects;

public class Ape extends Animal {
    private String size;
    @Override
    public void move(){
        System.out.println("Im moving like an APE");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ape ape = (Ape) o;
        return Objects.equals(size, ape.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    public Ape(String nume, int noOfLegs, String size) {
        super(nume, noOfLegs);
        this.size = size;
    }
}
