package Lab1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        System.out.print(isAdult);
        scanner.close();
    }
}
