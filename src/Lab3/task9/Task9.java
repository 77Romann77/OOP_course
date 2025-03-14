package Lab3.task9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 100);
        }
        System.out.println("Масив: " + Arrays.toString(a));

        System.out.println("Який індекс елемента оберешь?");
        int j = scanner.nextInt();
        System.out.println("Яке нове значення?");
        a[j] = scanner.nextInt();

        System.out.println("Масив: " + Arrays.toString(a));

        scanner.close();
    }
}
