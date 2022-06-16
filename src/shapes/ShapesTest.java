package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        Square square = new Square(5);
        myShape = square;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 4);
        myShape = rectangle;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
