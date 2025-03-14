package Lab3.task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
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

        System.out.print("Яке число ви шукаєте: ");
        int s = scanner.nextInt();

        for (int i : a) {
            if (s == i) {
                System.out.print("Шукане число є в масиві: " + s);
            } else {
                System.out.print("Шуканого число немає в масиві: " + s );
                break;
            }
        }
        scanner.close();
    }
}
