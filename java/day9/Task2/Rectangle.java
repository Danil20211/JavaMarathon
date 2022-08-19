package day9.Task2;

public class Rectangle extends Figure {
    private double wide;
    private double high;

    public Rectangle(double wide, double high, String color) {
        super(color);
        this.wide = wide;
        this.high = high;
    }

    @Override
    public double area() {
        return wide * high;
    }

    @Override
    public double perimeter() {
        return 2 * (wide + high);
    }
}
