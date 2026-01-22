//pgm 1(a)-Recursive function to find the factorial of a number

import java.util.Scanner;

public class Fact{

    public static int findFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * findFactorial(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            int factorial = findFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
