package Lab2.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("println: Ім'я: " + name +", Вік: " + age);
        System.out.printf("printf: Ім'я: %s, Вік: %d\n", name, age);
    }
}
