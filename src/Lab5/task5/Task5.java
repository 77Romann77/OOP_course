package Lab5.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // 1. Оголосіть масиви для зберігання запитань, варіантів відповідей та
        //правильних відповідей
        String[] question = {
                "Як має виглядає ціло численний тип данних?",
                "Скільки лап у кішки?",
                "Як гавкає собак?"
        };
        String[][] answers = {
                {"1. int ", "2. double ", "3. float"},
                {"1. 2", "2. 3", "3. 4"},
                {"1. Woof!", "2. Ruff!", "3. Yip!"}
        };
        int[] trueAnswers = {1, 3, 1};

        // 2. Створіть об'єкт Scanner для зчитування введених користувачем даних
        Scanner scanner = new Scanner(System.in);

        // 3. Оголосіть змінну для підрахунку правильних відповідей
        int sumAnswers = 0;

        // 4. Використайте цикл для виведення кожного питання та зчитування відповіді користувача
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }
            System.out.print("Введіть номер вірної відповіді: ");
            int ans = 0;
            boolean cheak = false;
            while (!cheak) {
                if (scanner.hasNextInt()) {
                    ans = scanner.nextInt();
                    if (ans >= 1 && ans <= 3) {
                        cheak = true;
                    } else {
                        System.out.println("Невірний вибір. Виберіть число від 1 до 4.");
                    }
                } else {
                    System.out.print("Введіть число: ");
                    scanner.next();
                }
            }
            // 5. Перевіряйте правильність введеної відповіді та оновлюйте рахунок
            if (ans == trueAnswers[i]) {
                System.out.println("Правильна відповідь!!!");
                sumAnswers++;
            } else {
                System.out.println("Неправильна відповідь!!!");
            }
        }
        // 6. Після завершення вікторини виведіть підсумковий результат
        System.out.println("Ваша кількість правильних відповідей: " + sumAnswers + " з " + question.length);
        // 7. Закрийте Scanner
        scanner.close();
    }
}
