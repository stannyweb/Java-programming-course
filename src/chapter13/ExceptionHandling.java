package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
//        createNewFile();
        numberExceptionHandling();
    }

    public static void createNewFile() {
        File file = new File("resources/file.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("No such directory Exist!");
            e.printStackTrace();
        }
    }

    public static void numberExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
