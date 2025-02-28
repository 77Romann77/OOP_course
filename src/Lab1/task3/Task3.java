package Lab1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter the nomber in byte: ");
        byte nom1 = scanner.nextByte();
        double nom2 = nom1 * 4.84;
        System.out.println("Your nomber in double: " + nom2);
        int nom3 = (int) nom2;
        System.out.println("Your nomber in int: " + nom3);
        scanner.close();
    }
}
