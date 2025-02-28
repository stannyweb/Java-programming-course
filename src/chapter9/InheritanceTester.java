package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Employee employee = new Employee();

    }

    public void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square!");
    }
}
