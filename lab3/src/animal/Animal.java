package animal;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Objects;

public class Animal {
    private String nume;
    private int noOfLegs;

    public String getNume() {
        return nume;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Animal(){
        this.nume = "";
        this.noOfLegs = 0;
    }
    public Animal(String nume, int noOfLegs){
        this.nume = nume;
        this.noOfLegs = noOfLegs;
    }

    public void move(){
        System.out.println("Im movin' !");
    }
    public void eat(){
        System.out.println("Im eatin' !");
    }
    public void eat(String food){
        System.out.println("Im eatin' " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return noOfLegs == animal.noOfLegs && Objects.equals(nume, animal.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, noOfLegs);
    }
}
