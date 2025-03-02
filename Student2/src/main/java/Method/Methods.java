package Method;

public class Methods {

    public static void main(String[] args) {
        int sum = sum(2, 3);
        int multiply = multiply(2, 3);
        printHello();
        int divide = divide(10, 5);
        System.out.println(divide);
    }

    public static int sum(int a, int b) {
        return a + b; //Створи метод sum(int a, int b), який приймає два цілі числа як параметри та повертає їх суму. Виклич цей метод у main() та виведи результат на екран.
    }

    private static int multiply(int a, int b) {
        return a * b; //Створи приватний метод multiply(int a, int b), який повертає добуток двох чисел. Виклич цей метод з іншого методу в тому ж класі.
    }


    public static void printHello() {
        //System.out.println("Hello, World!");//Створи метод printHello(), який нічого не приймає і не повертає, але виводить на екран "Hello, World!". Виклич цей метод у main().
    }

    public static int divide(int a, int b) { //Створи метод divide(int a, int b), який повертає результат ділення a на b. Якщо b дорівнює нулю, метод повинен повернути 0 і вивести повідомлення: "Division by zero is not allowed.".
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        } else {
            double divide = a / b;
            return (int) divide;

        }

    }

    public static void main(String[] args) {
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


