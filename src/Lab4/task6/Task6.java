package Lab4.task6;

public class Task6 {
    public static void main(String[] args) {
        printNumber();
//        System.out.println(num);
//        Помилка виникле через те , що num було оголошене
//        у методі printNumber() ,  а виходячи з методу
//        змінні не виносяться.
    }

    public static void printNumber() {
        int num = 10;
        System.out.println(num);
    }
}
