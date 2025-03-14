package Lab3.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;

        System.out.println("Відгадай число!");
        System.out.print("Введіть мінімальне: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне: ");
        int max = scanner.nextInt();

        int randomNumber = random.nextInt(min, max);
        System.out.println("Згенероване число " + randomNumber);
        System.out.printf("Вгадайте число у проміжку від %d до %d: ", min, max);

        do {
            System.out.print("Введіть число: ");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Спробуйте більше число!");
            } else if (guess > randomNumber) {
                System.out.println("Спробуйте менше число!");
            } else {
                System.out.println("Вітаємо! Вивгадали загадане число!!!");
            }
        } while (guess != randomNumber);
    }
}