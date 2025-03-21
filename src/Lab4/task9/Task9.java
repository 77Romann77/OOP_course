package Lab4.task9;

public class Task9 {
    public static void main(String[] args) {

        int sumZ = addVarargs(1, 4, 0, 5, 7);
        int sumX = addVarargs(3, 4, 6, 3, 8);
        int sumC = addVarargs(2, 0, 1, 2, 3);

        System.out.println("SumZ is: " + sumZ);
        System.out.println("SumX is: " + sumX);
        System.out.println("SumC is: " + sumC);
    }

    static int addVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
