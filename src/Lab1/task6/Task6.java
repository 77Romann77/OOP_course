package Lab1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your a (height) of rectangle: ");
        double  a = scanner.nextDouble();
        System.out.print("Enter your b (width) of rectangle: ");
        double  b = scanner.nextDouble();
        System.out.println( a * b );
        scanner.close();
    }
}
