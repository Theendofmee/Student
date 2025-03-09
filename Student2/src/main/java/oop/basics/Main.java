package oop.basics;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Cat
        Animal cat = new Cat("Emma");
        cat.makeSound();

        // Створення об'єкта Dog
        Animal dog = new Dog("Baks");
        dog.makeSound();
        //Cat solo = new Cat("");
    }
}
