package Lab3.task3;

public class Task3 {
    public static void main(String[] args) {

        for ( int i = 1 ; i < 10; i++) {
            int j = i * 7;
            System.out.println("Виведення через for: "+ j);
        }

        System.out.println();

        int q = 1;
        do{
            int w = q * 7;
            q++;
            System.out.println("Виведення через do-while: "+ w);
        }while (q < 10);

        System.out.println();

        int e = 1;
        while (e < 10 ){
            e++;
            int r = e * 7;
            System.out.println("Виведення через while: "+ r);
        }
    }
}
