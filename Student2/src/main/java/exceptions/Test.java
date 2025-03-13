package exceptions;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) throws NegativeNumberException {

        checkNumber(2); // Виклик методу з недійсним значенням

        // Обробка винятку

    }

    // Метод для перевірки числа
    static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Число не може бути від'ємним!");
        } else {
            System.out.println("Число є дійсним.");
        }
    }
}