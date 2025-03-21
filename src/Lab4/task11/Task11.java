package Lab4.task11;

public class Task11 {
    public static void main(String[] args) {
//        int num1 = findMax(4, 6, 3, 10, 8);
        System.out.println("Max: " + findMax(4, 6, 3, 10, 8));
    }

    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
