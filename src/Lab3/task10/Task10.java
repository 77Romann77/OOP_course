package Lab3.task10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент а[" + i + "] масиву: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Масив: " + Arrays.toString(a));
        System.out.print("Всі дублікати в масиві: ");

        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++){
                if(a[i] == a[j]){
                    System.out.print(a[i] + " ");
                    break;
                }

            }
        }
    }
}