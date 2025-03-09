package oop.basics;

class Animal {
    private String name;

    // Конструктор для ініціалізації імені
    Animal(String name) {
        this.name = name;
    }

    // Метод для виведення загального звуку тварини
    void makeSound() {
        System.out.println("Тварина говорить");
    }

    // Геттер для отримання імені
    String getName() {
        return name;
    }

    // Сеттер для встановлення імені
    void setName(String name) {
        this.name = name;
    }
}