package chapter7;

/*
Make an array that holds its actual values of the days of the week,
and then have the user input a number corresponding to some day of the week.
And assume that the week starts on Monday.

Your program should output the String that represents the day of the week that corresponds
to the number that the user input. For example, if the user inputs the number 1, your program should print “Monday”.
 */

import java.util.Scanner;

public class Chapter7Exercise {
    private static final String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a number for the day of the week");

        dayOfWeek();

    }

    public static void dayOfWeek() {
        int userChoice = scanner.nextInt();

        try {
            String day = daysOfWeek[userChoice - 1];
            System.out.println("The day is: " + day);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input. PLease enter a number between 1 - 7. Those are the days of the week.");
        }
        scanner.close();
    }

}
