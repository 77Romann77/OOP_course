package Lab4.task8;

public class Task8 {

    public static int counter = 10;

    public static void main(String[] args) {
        System.out.println("Global counter before *: " + counter);
        //Ми передаємо лише значення глобальної змінної
        setCounter(counter);
        System.out.println("Global counter after *: " + counter);
    }

    public static void setCounter(int counter) {
        //Ми домнажаємо лише параметр counter , ніяк не змінюючи глобальну змінну
        counter *= 4;
        System.out.println("Counter * 4 :" + counter);
    }
}
