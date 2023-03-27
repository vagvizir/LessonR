package org.example.Lesson1.Polimorfiam;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Sonya", 10, true);
        Dog dog = new Dog("Sharik", 20, true);
        // Pet(name, age) -> Cat(game)

        printPet(cat);
        printPet(dog);

        printSay(cat);
        printSay(dog);
        printSay(new Human());

        System.out.println(cat.NAMETWO);

        Say.sayInterface();
    }

    public static void printPet(Pet pet) {
        System.out.println(pet);
    }

    public static void printSay(Say say) {
        say.say();
    }
}