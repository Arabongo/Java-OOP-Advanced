package JAVAO._9;

public class Circle extends Shape{
    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    void calculateArea() {
        System.out.println( Math.PI * Math.pow((getHeight() / 2), 2));
    }
}
