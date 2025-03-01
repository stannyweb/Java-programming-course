package chapter13;

public class Chapter13Exercise {
    public static void main(String[] args) {

        handleDivisionByZero();
    }

    public static void handleDivisionByZero() {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not permitted");
        } finally {
            System.out.println("Division is fun");
        }

    }
}
