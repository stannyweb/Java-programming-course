package chapter3;

/*
IF statement.
All salespeople get a payment of 1000$ a week.
Salespeople who exceeds 10 sales get a bonus of 250$;
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

//        1. Initialize Known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

//        2. Get values from input
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        3. Detour for the bonus
        if (sales > quota)
            salary += bonus;

//        4. Output
        System.out.println("The employee's pay is $" + salary);
    }
}
