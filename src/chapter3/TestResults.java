package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Get the student score;
        System.out.println("Enter your test score");
        double studentScore = scanner.nextDouble();

//        2. Determine the letter grade
        char grade;

        if (studentScore < 60) {
            grade = 'F';
        } else if (studentScore < 70) {
            grade = 'D';
        } else if (studentScore < 80) {
            grade = 'C';
        } else if (studentScore < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Your student score is: " + grade);
    }
}
