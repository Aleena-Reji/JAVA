//Find nth Fibonacci number
import java.util.Scanner;

public class Fib {

    public static int findFibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return findFibonacci(num - 1) + findFibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Fibonacci is not defined for negative numbers");
        } else {
            int fibonacci = findFibonacci(num);
            System.out.println("Fibonacci number at position " + num + " is: " + fibonacci);
        }

        scanner.close();
    }
}
