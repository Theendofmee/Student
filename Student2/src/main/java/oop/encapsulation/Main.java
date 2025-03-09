package oop.encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount diRektor = new BankAccount(1, 0);
        System.out.println("Поточний баланс " + diRektor.getBalance());
        diRektor.deposit(100);
        System.out.println("Поповнення балансу " + diRektor.getBalance());
        diRektor.withdraw(100);
        System.out.println("Зняття коштів " + diRektor.getBalance());
    }
}