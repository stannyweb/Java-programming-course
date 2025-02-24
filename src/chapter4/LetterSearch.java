package chapter4;

import java.util.Scanner;

/*
FOR LOOP Break
Search a string to determine if it contains the letter 'A'
 */
public class LetterSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1. Get the text
        System.out.println("Enter some text:");
        String text = scanner.next();
        scanner.close();

//        2. Search text for letter 'A'
        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound)
            System.out.println("The text contains the letter 'A'");
        else
            System.out.println("This text does not contain the letter 'A'");

    }
}
