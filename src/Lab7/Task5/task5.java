package Lab7.Task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clock clock = new Clock();
        System.out.print("Введіть години:");
        clock.setHours(scanner.nextInt());
        System.out.print("Введіть хвилини:");
        clock.setMinutes(scanner.nextInt());
        System.out.print("Введіть секунди:");
        clock.setSeconds(scanner.nextInt());

        clock.displayTime();
        System.out.println("На скільки секунд вперед пройти годиннику?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            clock.tick();
        }
        clock.displayTime();
    }
}
