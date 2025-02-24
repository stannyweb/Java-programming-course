package chapter4;

import java.util.Scanner;

/*
FOR Loop
Write a cashier program that will scan the given number of items and tally the cost
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        int quantity = scanner.nextInt();

        double total = 0;

//        2. Create a loop to iterate through all the items and accumulate the costs
        for (int x = 0; x < quantity; x++) {

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total += price;
        }

        scanner.close();

        System.out.println("Total: $" + total);

    }
}
