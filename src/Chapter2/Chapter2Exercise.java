package Chapter2;

import java.util.Scanner;

public class Chapter2Exercise {

    public static void main(String[] args) {

//        1. Ask the user season of the year.
        System.out.println("Enter season of the year.");
        Scanner scanner = new Scanner(System.in);
        String seasonInput = scanner.nextLine();

//        2. Ask the user for a whole number.
        System.out.println("Enter a whole number (between 1 - 10).");
        int numberInput = scanner.nextInt();

        scanner.nextLine();

//        3. Ask the user for an adjective.
        System.out.println("Enter an adjective.");
        String adjectiveInput = scanner.nextLine();
        scanner.close();

//        4. Display the results.
        String results = "On a " + adjectiveInput + " " + seasonInput + " day, I drink a minimum of " + numberInput + " cups of coffee.";
        System.out.println(results);
    }
}
