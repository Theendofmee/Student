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
                return (int) divide

            }

        }
    //Створи метод square(int x), який приймає ціле число та повертає його квадрат.
    public static void main(String[] args) {
        int number = 6;
        int result = square(number);
        System.out.println("Square of a number " + number + " Equals " + result);
    }

    //
    public static int square(int x) {
        return x * x;
    }

    // Функція sumArray, яка повертає суму елементів масиву
    public static void main(String[] args) {
        int[] number = {6, 4, 5, 6, 2, 2};//
        int result = sumArray(number);
        System.out.println("sum of array elements:" + result);
    }


    public static int sumArray(int[] array) {
        int sum = 0;//
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    //Створи рекурсивну функцію factorial(int n), яка обчислює факторіал числа.
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of a number " + n + " Equals " + result);//
    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);//
    }
}


