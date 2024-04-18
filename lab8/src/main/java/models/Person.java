package models;

public class Person {
    String name;
    String prenume;
    String email;
    int age;

    public Person(String name, String email, String prenume, int age) {
        this.name = name;
        this.email = email;
        this.prenume = prenume;
        this.age = age;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
