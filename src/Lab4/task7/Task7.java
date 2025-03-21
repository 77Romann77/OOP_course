package Lab4.task7;

public class Task7 {

    static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Перший прохід " + counter);
        increment();
        System.out.println("Другий прохід " + counter);
        increment();
        System.out.println("Третій прохід " + counter);
    }

    public static void increment() {
        counter++;
    }
}
