//Generate Multiplication Table
import java.util.Scanner;

 class Table {

    public void multiTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Table t = new Table();
        t.multiTable(num);

        scanner.close();
    }
}
