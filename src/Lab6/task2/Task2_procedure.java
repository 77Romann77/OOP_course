package Lab6.task2;

import java.util.Scanner;

public class Task2_procedure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mark;
        String model;
        int speed;
        int up;

        System.out.print("Введіть марку авто: ");
        mark = scanner.nextLine();
        System.out.print("Введіть модель авто: ");
        model = scanner.nextLine();
        System.out.print("Введіть швидкість авто: ");
        speed = scanner.nextInt();
        carInfo(mark, model, speed);
        System.out.println("На скільки прискорити ваш транспорт?");
        up = scanner.nextInt();
        speed_up(speed, up);
    }

    public static void speed_up(int speed, int up) {
        speed += up;
        System.out.println("Нова швидкість: "+speed);
    }

    public static void carInfo(String mark, String model, int speed) {
        System.out.println("Марка авто: " + mark + "\nМодель авто: " + model + "\nШвидкість авто: " + speed);
    }

}
