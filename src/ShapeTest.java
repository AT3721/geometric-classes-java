package src;

public class ShapeTest {
    public static void main(String[] args) {

        System.out.println("Test shape:");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("Test circle:");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "blue", false);
        System.out.println(circle);

        System.out.println("Test rectangle:");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        System.out.println("Test square:");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
