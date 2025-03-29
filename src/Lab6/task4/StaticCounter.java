package Lab6.task4;

public class StaticCounter {
    public static int counter;

    public static void increment(int increment) {
        counter += increment;
    }

    public static void getCount() {
        System.out.println("Ваше число після додавання: " + counter);
    }
}
