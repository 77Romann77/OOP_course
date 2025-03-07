package Lab2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int num = scanner.nextInt();

        System.out.println("Квадратний корінь: " + Math.sqrt(num));
        System.out.println("Округлене значення: " + Math.round(num));
        System.out.println("Піднесене до квадрату: " + Math.pow(num,2));
        System.out.println("Синус числа: " + Math.sin(Math.toRadians(num)));
    }
}
