package oop.encapsulation;

class BankAccount {
    // Приватні змінні які не доступні зовні (Final - константа ця змінна ніколи не зміниться як тільки отримала значення )
    private final int accountNumber;
    private double balance;

    //При створенні заповнюємо наші приватні змінні зовнішніми(с main)
    BankAccount(int accountNumber, double balance) {
        // Розовий це наша приватна змінна біла для заповнення
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //отримання приватного значення змінной за допомогою метода гет
    double getBalance() {
        // ми вертаэмо нашу приватну змінну в баланс
        return balance;
    }

    //отримання приватного значення змінной за допомогою метода гет
    int getAccountNumber() {

        return accountNumber;
    }

    // cетер для балансу
    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    // cетер для балансу
    void withdraw(double amount) {
        this.balance = this.balance - amount;

    }
}






