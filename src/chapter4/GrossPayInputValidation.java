package chapter4;

import java.util.Scanner;

/*
WHILE Loop
Each store employee makes $15 an hour. Write a program that allows the employee
to enter the number of hours worked for the week. Do not allow overtime
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Init known variables
        int rate = 15;
        int maxHours = 40;

//        2. Get input for unknown variables
        System.out.println("How many hours did you worked this week?");
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 - 40. Try again!");
            hoursWorked = scanner.nextDouble();
        }

        double gross = rate * hoursWorked;
        System.out.println("Gross pay is: $" + gross);
    }
}
