package chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;


    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printNumbers(ticket);
    }

    public static int[] generateNumbers() {

        Random random = new Random();
        int[] ticket = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    public static void printNumbers(int[] ticket) {

        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
