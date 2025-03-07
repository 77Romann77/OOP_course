package Lab2.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок: Java is awesome!");
        System.out.print("Ваш рядок: ");
        String name = scanner.nextLine();

        int length = name.length();
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();
        String substring = name.substring(0, 3);
        boolean containsJava = name.contains("Java");

        System.out.println("Довжина рядка: " + length);
        System.out.println("Перший символ: " + firstLetter);
        System.out.println("Останній символ: " + lastLetter);
        System.out.println("Верхній регістр: " + upperCase);
        System.out.println("Нижній регістр: " + lowerCase);
        System.out.println("Підрядок: " + substring);
        System.out.println("Чи містить слово 'Java'? " + containsJava);

        scanner.close();
    }
}
