package chapter3;

import java.util.Scanner;

/*
NESTED IFs
To qualify for a loan, a person must make at least $30,000
and have been working to the current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

//        2.Get what we don't know
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

//        3. Make decision.
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats. You are eligible for a loan.");
            } else {
                System.out.println("Sorry. You must have worked at your current job for " + requiredYearsEmployed + " years.");
            }
        } else {
            System.out.println("Sorry. You must earn at least $" + requiredSalary);
        }


    }
}
