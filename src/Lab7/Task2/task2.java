package Lab7.Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5. Створіть об’єкт класу Book, задайте значення та виведіть інформацію.
        Book book = new Book();
        System.out.print("Введіть назву книги: ");
        book.setTitle(scanner.nextLine());

        System.out.print("Введіть автора книги: ");
        book.setAuthor(scanner.nextLine());

        System.out.println("Яка ціна книги?");
        book.setPrice(scanner.nextDouble());

        book.displayInfo();
        scanner.close();
    }
}
