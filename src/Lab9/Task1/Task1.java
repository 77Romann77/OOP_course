package Lab9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Складання двох цілих чисел: " + calculator.add(1, 4));

        System.out.println("Складання чисел з плавачою комою: " + calculator.add(0.1, 0.8));

        System.out.println("Складання трех цілих чисел:" + calculator.add(20, 30, 2));
    }
}
