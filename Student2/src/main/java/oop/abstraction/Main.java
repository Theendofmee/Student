package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Transport.Car toyota = new Transport.Car("Toyota");
        toyota.move();
        Transport.Boat yamaha = new Transport.Boat("Yamaha");
        yamaha.move();
    }
}