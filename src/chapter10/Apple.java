package chapter10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(10);
    }

    public void removeSeeds() {
        System.out.println("Removing the seeds...");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making the apple juice...");
    }
}
