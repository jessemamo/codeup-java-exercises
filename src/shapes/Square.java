package shapes;

public class Square extends Rectangle {

    private double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("This is the Square method.");
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the Square method.");
        return 4 * side;
    }
}
