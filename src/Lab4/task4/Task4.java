package Lab4.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        String result1 = printInfo(name);
        System.out.println(result1);

        String result2 = printInfo(name, age);
        System.out.println(result2);
    }

    public static String printInfo(String name) {
        return "Name: " + name;
    }

    public static String printInfo(String name, int age) {
        return "Name: " + name + ". " + "Age: " + age;
    }
}
