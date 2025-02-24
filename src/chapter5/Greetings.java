package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}
