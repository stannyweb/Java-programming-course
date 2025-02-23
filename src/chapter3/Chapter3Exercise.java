package chapter3;

import java.util.Scanner;

public class Chapter3Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Known values
        double pennies = 0.01;
        double nickels = 0.05;
        double dime = 0.10;
        double quarters = 0.25;
        int range = 1;

//        2. Unknown values
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter how many pennies?");
        double penniesInput = scanner.nextDouble();

        System.out.println("Enter how many nickels?");
        double nicklesInput = scanner.nextDouble();

        System.out.println("Enter how many dimes?");
        double dimesInput = scanner.nextDouble();

        System.out.println("Enter how many quarters?");
        double quartersInput = scanner.nextDouble();

        scanner.close();

//        3. The calculations
        double penniesSum = penniesInput * pennies;
        double nicklesSum = nicklesInput * nickels;
        double dimeSum = dimesInput * dime;
        double quartersSum = quartersInput * quarters;
        double totalSum = penniesSum + nicklesSum + dimeSum + quartersSum;

//        4.The logic and decisions
        if (totalSum == range)
            System.out.println("Congrats, you win!");
        else if (totalSum > range)
            System.out.println("Sorry, you lost. You are over $" + range + " with $" + (totalSum - range));
        else {
            System.out.println("Sorry, you lost. You are under $" + range + " with $" + (range - totalSum));
        }

    }
}
