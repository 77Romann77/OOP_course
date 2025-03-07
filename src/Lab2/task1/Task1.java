package Lab2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if ( num > 0 ) {
            System.out.println("Your number + ");
        } else if ( num == 0 ) {
            System.out.println("Your number = 0");
        } else {
            System.out.println("Your number -");
        }
        sc.close();
    }
}
