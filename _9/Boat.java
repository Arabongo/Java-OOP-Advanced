package JAVAO._9;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("la barca si muove avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("la barca si muove indietro");

    }
}
