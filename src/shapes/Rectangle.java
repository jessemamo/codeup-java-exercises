package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("This is the Rectangle");
        return length * width;
    }

    public double getPerimeter(){
        System.out.println("This is the Rectangle method");
        return 2 * length + 2 * width;
    }
}