package Lab6.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Звичайний counter");
        Counter counter = new Counter();
        System.out.print("Введіть бажане число: ");
        counter.counter = scanner.nextInt();
        System.out.println("На скільки збільшити ваше число: " + counter.counter);
        counter.increment(scanner.nextInt());
        counter.getCount();

        System.out.println("Static counter");
        System.out.print("Введіть бажане число: ");
        StaticCounter.counter = scanner.nextInt();
        System.out.println("На скільки збільшити ваше число: " + StaticCounter.counter);
        StaticCounter.increment(scanner.nextInt());
        StaticCounter.getCount();
        //Поведінка у Counter і у StaticCounter однакова, але у
        //StaticCounter ми не використовуємо новий об'єкт, а звертаємося безпосередньо до counter
    }
}
