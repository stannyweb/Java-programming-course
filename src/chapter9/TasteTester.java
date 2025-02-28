package chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("Mint");
        cake.setPrice(24.55);
        System.out.println("Cake flavor is: " + cake.getFlavor());
        System.out.println("Cake price is: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
//        birthdayCake.setPrice(30.00);
        System.out.println("Birthday cake flavor is: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake price is: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Wedding cake flavor is: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price is: " + weddingCake.getPrice());
    }

}
