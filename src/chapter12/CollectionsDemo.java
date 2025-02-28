package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
        mapDemo();

    }

    public static void setDemo() {

        Set<String> fruit = new HashSet<>();
        fruit.add("banana");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Pineapple");
        fruit.add("banana");

        System.out.println(fruit.size());
        System.out.println(fruit);

        for (String item : fruit) {
            System.out.println(item);
        }

        fruit.forEach(x -> System.out.println(x.length()));
        fruit.forEach(System.out::println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 105);
        fruitCalories.put("Mango", 90);
        fruitCalories.put("pineapple", 150);
        fruitCalories.put("Mango", 85);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        for (var value : fruitCalories.entrySet()) {
            System.out.println(value.getValue());
        }

        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + " Calories: " + v));


    }
}
