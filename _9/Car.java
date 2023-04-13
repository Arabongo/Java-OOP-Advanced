package JAVAO._9;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("la macchina si muove avanti");
    }
    @Override
    public void moveBackward() {
        System.out.println("la macchina si muove indietro");
    }
}
