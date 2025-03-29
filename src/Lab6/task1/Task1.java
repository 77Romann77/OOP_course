package Lab6.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваше ім'я:");
        person.name = scanner.nextLine();
        System.out.print("Ваш вік:");
        person.age = scanner.nextInt();

        person.introduce();
    }
}
