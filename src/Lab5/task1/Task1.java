package Lab5.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. Створіть об'єкт Scanner для зчитування введених користувачем даних
        Scanner scanner = new Scanner(System.in);

        // 2. Оголосіть змінні для збереження введених даних
        // 3. Запитайте у користувача та збережіть значення у змінні
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter monthlyDeposit: ");
        double monthlyDeposit = scanner.nextDouble();

        System.out.print("Enter annualRate: ");
        // 4. Переведіть процентну ставку у десятковий вигляд
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter years: ");
        int years = scanner.nextInt();

        System.out.print("Enter timesCompounded: ");
        int timesCompounded = scanner.nextInt();

        int totalMonth = years * 12;

        double balance = principal;

        // 5. Обчисліть кінцеву суму за формулою складеного відсотка
        for (int i = 0; i < totalMonth; i++) {
            balance += monthlyDeposit;
            balance *= Math.pow(1 + annualRate / timesCompounded, (double) timesCompounded / 12);
        }

        // 6. Виведіть результат у зручному форматі
        System.out.printf("Total amount after %d is: %.2f", years, balance);
        // 7. Закрийте Scanner
        scanner.close();
    }
}
