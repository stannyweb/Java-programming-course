package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your letter grade:");

        String grade = scanner.next();
        String message = switch (grade) {
            case "A" -> "Excellent job";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh";
            default -> "Incorrect grade letter";
        };

        System.out.println(message);
    }
}
