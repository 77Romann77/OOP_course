package Lab6.task2;

import java.util.Scanner;

public class Task2_OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Введіть марку авто: ");
        car.mark = scanner.nextLine();
        System.out.print("Введіть модель авто: ");
        car.model = scanner.nextLine();
        System.out.print("Введіть швидкість авто: ");
        car.speed = scanner.nextInt();
        car.carInfo();
        System.out.println("На скільки прискорити ваш транспорт?");
        car.up = scanner.nextInt();
        car.speed_up();
    }
}
