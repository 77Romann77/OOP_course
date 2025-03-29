package Lab6.task4;

public class Counter {
    public int counter;

    public void increment(int increment) {
        counter += increment;
    }

    public void getCount() {
        System.out.println("Ваше число після додавання: " + counter);
    }
}
