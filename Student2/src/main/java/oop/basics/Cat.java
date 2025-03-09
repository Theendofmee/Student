package oop.basics;

class Cat extends Animal {
    // Конструктор для ініціалізації імені
    Cat(String name) {
        super(name);
    }

    // Перевизначений метод makeSound для кота
    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " МЯУ МЯУ");
    }
}
