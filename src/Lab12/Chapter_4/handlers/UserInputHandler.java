package Lab12.Chapter_4.handlers;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Ви ввели строку, будь ласка введіть цифру. Спробуйте ще раз.");
            scanner.next();
        }

        int intInput = scanner.nextInt();
        scanner.nextLine();

        return intInput;
    }
}
