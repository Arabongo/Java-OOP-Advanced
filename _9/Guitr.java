package JAVAO._9;

public class Guitr extends Instrument{
    Guitr(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("sto suonando la chitarra");
    }
}
