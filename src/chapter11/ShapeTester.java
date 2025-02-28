package chapter11;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 15);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
