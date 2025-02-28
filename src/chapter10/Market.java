package chapter10;

public class Market {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();

        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();



        Fruit apple2 = new Apple();
        ((Apple) apple2).removeSeeds();

        squeezing(apple2);
    }

    public static void squeezing(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
