package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. init known values
        int numberOfStudents = 24;
        int numberOfTests = 4;

//        2. Process all students
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for Test #" + (j + 1));
                double score = scanner.nextDouble();
                total += score;
            }

            double averageScore = total / numberOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + averageScore);
        }

        scanner.close();
    }
}
