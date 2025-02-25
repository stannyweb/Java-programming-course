package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area of the rooms are: " + area);

        calculator.scanner.close();

    }

    public Rectangle getRoom() {
        System.out.println("Enter the legth of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle kitchen, Rectangle bathroom) {
        return kitchen.calculateArea() + bathroom.calculateArea();
    }
}
