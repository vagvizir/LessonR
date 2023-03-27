package org.example.Lesson1.Polimorfiam;

public class Dog extends Pet implements Say {
    boolean budga;

    public Dog(String name, int age, boolean budga) {
//            public Pet(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
        super(name, age);
        this.budga = budga;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "budga=" + budga +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void say() {
        System.out.println("Gav");
    }
}
