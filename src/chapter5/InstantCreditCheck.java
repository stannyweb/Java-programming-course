package chapter5;

import java.util.Scanner;

/*
Variable scope
Write an 'instant credit check' program that approves
anyone who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args) {

//        2. Get unknown variables
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

//        3. Check if the user is qualified
        boolean qualified = isUserQualified(salary, creditScore);

//        4. Notify the user
        notifyTheUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static void notifyTheUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats. You've been approved.");
        } else {
            System.out.println("Sorry. You've been declined.");
        }
    }
}
