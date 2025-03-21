package Lab4.task10;

public class Task10 {
    public static void main(String[] args) {
        int num1 = printNumbers("Entered numbers 1: ", 1, 4, 0, 5, 7);
        int num2 = printNumbers("Entered numbers 2: ", 4, 6, 3, 10, 8);

    }

    public static int printNumbers(String message, int... numbers) {
        System.out.print(message);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        return 0;
    }
}
