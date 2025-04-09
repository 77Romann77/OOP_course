package Lab7.Task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.println("Укажіть у наступних рядках вашу омріяну авто!!!");
        System.out.print("Введіть бренд авто:");
        car.setBrand(scanner.nextLine());
        System.out.print("Введіть модель авто:");
        car.setModel(scanner.nextLine());
        System.out.print("Введіть швидкість авто:");
        car.setSpeed(scanner.nextInt());

        System.out.print("На яку швидкість прискоримо авто:");
        car.accelerate(scanner.nextInt());

        System.out.print("На скільки зменшити швидкість авто:");
        car.brake(scanner.nextInt());

        System.out.println();
        System.out.println("Стан авто\nБренд:" + car.getBrand() + "\nМодель:" + car.getModel() + "\nШвидкість:" + car.getSpeed());
    }
}
