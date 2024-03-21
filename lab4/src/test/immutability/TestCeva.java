package test.immutability;

public final class TestCeva  {
    private final String nume;
    private final StringBuilder numeMutabil;

    public TestCeva(){
        this.nume = "NumeDefault";
        this.numeMutabil = new StringBuilder("NumeMutDefault");
    }
    public TestCeva(String nume, StringBuilder numeMutabil){
        this.nume = nume;
        this.numeMutabil = new StringBuilder(numeMutabil);
    }

    public String getNume(){ return this.nume;}
    public StringBuilder getNumeMutabil(){ return this.numeMutabil;}

    public static void main(String[] args){

        TestCeva object = new TestCeva("NumeIm", new StringBuilder("NumeMut"));
        TestCeva obj = new TestCeva();
        System.out.println(object.getNume() + " " + object.getNumeMutabil());
        System.out.println(obj.getNume() + " " + obj.getNumeMutabil());

    }

}
