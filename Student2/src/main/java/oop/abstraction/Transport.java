package oop.abstraction;

abstract class Transport {

    private final String name;

    Transport(String name) {
        this.name = name;
    }

    abstract void move();

    static class Car extends Transport {
        Car(String name) {
            super(name);
        }

        @Override
        void move() {
            System.out.println("Автомобіль їде по дорозі");
        }
    }

    static class Boat extends Transport {
        Boat(String name) {
            super(name);
        }

        @Override
        void move() {
            System.out.println("Човен пливе по воді");
        }
    }
}

