package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    static Random random = new Random();


    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printNumbers(ticket);
    }

    public static int[] generateNumbers() {


        int[] ticket = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does generate and search again.
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

//            Number is unique if we get here. Add it to the array
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find value
     *
     * @param array             Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {

        for (int value : array) {
            if (value == numberToSearchFor) return true;
        }

        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        //Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        return index >= 0;
    }

    public static void printNumbers(int[] ticket) {

        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
