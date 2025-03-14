package Lab3.task6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(a));

        int min = a[0];
        int max = a[0];
        int sum = 0;
        int j = 0;

        for (int i : a) {
            if (i > max) max = i;
            if (i < min) min = i;
            sum += i;
            if (i % 2 == 0)
                j++;
        }
        System.out.println("Мінімалье та максимальне значення " + min + " , " + max);
        System.out.println("Середне значення " + sum / n);
        System.out.println("Кількість парних чисел " + j);

        scanner.close();
    }
}
