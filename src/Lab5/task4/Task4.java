package Lab5.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 1. Створіть об'єкт Scanner для зчитування введених користувачем даних
        Scanner scanner = new Scanner(System.in);

        // 2. Створіть об'єкт Random для генерації випадкових чисел
        Random random = new Random();

        // 3. Оголосіть змінні для збереження кількості кубиків та підсумкової суми
        int bones;
        int sum = 0;

        // 4. Запитайте у користувача кількість кубиків
        System.out.print("Скільки кубиків будемо кидати: ");
        bones = scanner.nextInt();

        // 5. Перевірте, щоб введене число було понад 0
        // 6. Використайте цикл для симуляції кидків кубиків
        if (bones > 0) {
            for (int i = 0; i < bones; i++) {
                int roll = random.nextInt(1, 7);
                // 7. Виведіть кожен кидок у вигляді ASCII-арту (винесіть цей функціонал у
                //окремий метод print)
                print(roll);
                sum += roll;
            }
            // 8. Обчисліть та виведіть загальну суму
            System.out.println("Сума кубиків: " + sum);
        } else {
            System.out.println("Введено невірна кількість кубиків");
        }

        // 9. Закрийте Scanner
        scanner.close();
    }

    static void print(int roll) {
        // створіть кожен кубик
        // виведіть кубик залежно від аргументу roll
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll) {
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;
        }
    }
}

