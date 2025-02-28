package chapter10;

public class Zoo {

    public static void main(String[] args) {
        Dog felix = new Dog();
        felix.makeSound();
        felix.fetch();
        feed(felix);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }
}
