package Lab4.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть a число:");
        int a = scanner.nextInt();
        System.out.print("Введіть b число:");
        int b = scanner.nextInt();

        int result = sum(a, b);
        System.out.println("Сума: " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
