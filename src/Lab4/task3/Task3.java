package Lab4.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть a число:");
        int a = scanner.nextInt();
        System.out.print("Введіть b число:");
        int b = scanner.nextInt();

        int result = multiply(a, b);
        System.out.println("Добуток: " + result);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
