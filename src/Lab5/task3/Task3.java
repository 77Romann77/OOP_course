package Lab5.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 1. Створіть об'єкт Scanner для зчитування введених користувачем даних
        Scanner scanner = new Scanner(System.in);

        // 2. Оголосіть змінні для збереження введених даних
        double firstNumber;
        double secondNumber;
        String operachin;
        double result = 0;

        // 3. Запитайте у користувача та збережіть значення у змінні
        System.out.print("Введіть перше число: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Введіть бажану операцію (+, -, *, /, ^): ");
        operachin = scanner.next();
        System.out.print("Введіть друге число: ");
        secondNumber = scanner.nextDouble();

        // 4. Використовуйте switch для вибору операції
        // 5. Обробіть випадок ділення на нуль
        switch (operachin) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Ділити на 0 не можна!!!");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case "^":
                result = Math.pow(firstNumber , secondNumber);
                break;
            default:
                System.out.println("Введена невірна операція");
        }

        // 6. Виведіть результат
        System.out.println("Результат: " + result);

        // 7. Закрийте Scanner
        scanner.close();
    }
}
