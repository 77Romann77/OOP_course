package Lab5.task6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // 1. Створіть об'єкт Scanner для зчитування введених користувачем даних
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 2. Створіть масив або список із варіантами вибору (rock, paper, scissors)
        String[] variant = {"rock", "paper", "scissors"};
        // 3. Оголосіть змінні для збереження вибору гравця та комп’ютера
        String player = "";
        // 4. Реалізуйте цикл для повторення гри
        System.out.println("Гра почалась!!!");
        String play = "yes";
        do {
            System.out.print("Оберіть rock, paper або scissors: ");
            // 5. Зчитайте введене значення та перевірте його коректність
            boolean isProp = false;
            while (!isProp) {
                player = scanner.nextLine();
                for (String prop : variant) {
                    if (player.equalsIgnoreCase(prop)) {
                        isProp = true;
                        break;
                    }
                }
                if (!isProp) {
                    System.out.println("Обрано невірний запис!!!");
                    System.out.print("Оберіть rock, paper або scissors: ");
                }
            }
            // 6. Використовуйте Random для генерації вибору комп’ютера
            String pcOut = variant[random.nextInt(0, 3)];
            System.out.println("Комп'ютер обрав: " + pcOut);
            // 7. Визначте переможця за допомогою умов
            short isPlayerWin = -1;
            if (player.equalsIgnoreCase(pcOut)) {
                isPlayerWin = 0;
            } else if (player.equalsIgnoreCase("rock")) {
                if (pcOut.equalsIgnoreCase("scissors")) {
                    isPlayerWin = 1;
                }
            } else if (player.equalsIgnoreCase("paper")) {
                if (pcOut.equalsIgnoreCase("rock")) {
                    isPlayerWin = 1;
                }
            } else {
                if (pcOut.equalsIgnoreCase("paper")) {
                    isPlayerWin = 1;
                }
            }
            // 8. Виведіть результат раунду
            if (isPlayerWin == 1) {
                System.out.println("Ви перемогли!!!");
            } else if (isPlayerWin == -1) {
                System.out.println("Ви програли!!!");
            } else {
                System.out.println("Нічия!!!");
            }
            // 9. Запитайте, чи хоче гравець зіграти ще раз
            System.out.println("Ви хочете грати ще (yes/no)?");
            play = scanner.nextLine();
        } while (play.equals("yes"));
        // 10. Виведіть фінальне повідомлення та закрийте Scanner
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
