package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /******************************
         * RECTANGLE 1
         ********************************/

        Rectangle rectangleRoomArea = new Rectangle(30, 50);
        double areaOfRoom = rectangleRoomArea.calculateArea();

        Rectangle rectangleRoomPerimeter = new Rectangle(50, 50);
        double perimeterOfRoom = rectangleRoomPerimeter.calculatePerimeter();

        System.out.println("Area of room1 is: " + areaOfRoom);
        System.out.println("Perimeter of room2 is: " + perimeterOfRoom);

    }
}
