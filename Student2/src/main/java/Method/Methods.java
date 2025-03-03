package Method;

public class Methods {

    public static void main(String[] args) {
        // Виклик методу sum
        int sumResult = sum(2, 3);
        System.out.println("Sum: " + sumResult);

        // Виклик методу multiply через інший метод
        int multiplyResult = getProduct(2, 3);
        System.out.println("Multiply: " + multiplyResult);

        // Виклик методу printHello
        printHello();

        // Виклик методу divide
        int divideResult = divide(10, 5);
        System.out.println("Divide: " + divideResult);

        // Виклик методу square
        int numberSquare = 6;
        int resultSquare = square(numberSquare);
        System.out.println("Square of a number " + numberSquare + " Equals " + resultSquare);

        // Виклик методу sumArray
        int[] numberArray = {6, 4, 5, 6, 2, 2};
        int resultArray = sumArray(numberArray);
        System.out.println("Sum of array elements: " + resultArray);

        // Виклик рекурсивного методу factorial
        int numberFactorial = 5;
        int resultFactorial = factorial(numberFactorial);
        System.out.println("Factorial of a number " + numberFactorial + " Equals " + resultFactorial);
    }

    // Метод sum, який повертає суму двох чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // Приватний метод multiply, який повертає добуток двох чисел
    private static int multiply(int a, int b) {
        return a * b;
    }

    // Публічний метод для виклику приватного методу multiply
    public static int getProduct(int a, int b) {
        return multiply(a, b);
    }

    // Метод printHello, який виводить "Hello, World!"
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // Метод divide, який повертає результат ділення a на b
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Метод square, який повертає квадрат числа
    public static int square(int x) {
        return x * x;
    }

    // Метод sumArray, який повертає суму елементів масиву
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Рекурсивний метод factorial, який обчислює факторіал числа
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}


