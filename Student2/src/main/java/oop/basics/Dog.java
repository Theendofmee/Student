package oop.basics;

class Dog extends Animal {
    // Конструктор для ініціалізації імені
    Dog(String name) {
        super(name);
    }

    // Перевизначений метод makeSound для собаки
    @Override
    void makeSound() {
        System.out.println("Dog " + getName() + " Гав Гав");
    }
}