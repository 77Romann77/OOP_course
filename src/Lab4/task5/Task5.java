package Lab4.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter number for length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter number for width: ");
        double width = scanner.nextDouble();

        double result1 = calculateArea(radius);
        System.out.println(result1);
        double result2 = calculateArea(length, width);
        System.out.println(result2);
    }

    public static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

}