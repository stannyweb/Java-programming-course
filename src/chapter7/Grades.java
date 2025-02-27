package chapter7;

/*
Create a program that allows the user to enter any
number of grades and provides them with their
average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades you want to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average score is: " + String.format("%.2f", getAverageScore()));
        System.out.println("The hihest score is: " + getHighest());
        System.out.println("The Lowest score is: " + getLowest());

    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade number: #" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static double getAverageScore() {
        int sum = 0;
        for (int value : grades) {
            sum += value;
        }
        return sum / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int number : grades) {
            if (number > highest) {
                highest = number;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int number : grades) {
            if (number < lowest) {
                lowest = number;
            }
        }
        return lowest;
    }


}
