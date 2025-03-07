package Lab2.task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть мінімальне значення:");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне значення:");
        int max = scanner.nextInt();
        int num = random.nextInt(min ,max );
        System.out.println("Згенероване число:" + num);
        System.out.printf("Число %d є %s",num , num % 2 == 0 ? "парне" : "не парне" );

        scanner.close();
    }
}
