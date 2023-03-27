package org.example.Lesson1.Polimorfiam;

public class Cat extends Pet implements Say, ffff {
    boolean game;

    public Cat(String name, int age, boolean game) {
        super(name, age);
        this.game = game;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "game=" + game +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void say() {
        System.out.println("Mya");
    }
}
