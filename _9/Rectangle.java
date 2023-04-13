package JAVAO._9;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    void calculateArea() {
        System.out.println(getHeight()*getWidth());
    }
}
