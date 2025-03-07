package Lab2.extraTask1;

import java.util.Scanner;

public class ExtraTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваш email: ");
        String email = scanner.nextLine();

        int letter = email.lastIndexOf("@");

        String username = email.substring(0, letter);
        String domain = email.substring(letter);

        System.out.println("Ваш username: " + username);
        System.out.println("Ваш до domain: " + domain);
    }
}
