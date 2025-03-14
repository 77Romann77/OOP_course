package Lab3.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
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

        Arrays.sort(a);
        System.out.println("Відсортований масив: " +Arrays.toString(a));

        scanner.close();
    }
}