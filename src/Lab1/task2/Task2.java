package Lab1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nomber : ");
        double nomber = scanner.nextDouble();
        System.out.print( Math.PI * nomber *nomber);
        scanner.close();
    }
}
