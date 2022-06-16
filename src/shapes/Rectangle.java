package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(float length, float width) {
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * width);
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    protected double length;
//    protected double width;
//
//    public Rectangle(){}
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("This is the Rectangle");
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("This is the Rectangle method");
//        return 2 * length + 2 * width;
//    }
}