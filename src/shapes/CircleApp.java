package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        String prompt = "Enter the radius of your circle in inches:";
        Input input = new Input();
        double radius = input.getDouble(prompt);
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of your circle is %.2f square inches and its circumference is %.2f inches %n", area, circumference);
    }

}
