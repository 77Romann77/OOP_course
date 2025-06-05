package Lab12.Chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nДоброго дня!!!");
        System.out.println("Вас вітає магазин ігрової периферії HATOR\n");

        ArrayList<String> products = new ArrayList<>();
        products.add("Навушники Hator Hypergang 3 Wireless Black ");
        products.add("Клавіатура Hator Rockfall 3 Mecha TKL Wireless");
        products.add("Миша Hator Quasar 3 Ultra 8K Wireless Black");
        products.add("Ігрова поверхня Hator Tonn eSport Monte Edition 3XL Speed/Control Multicolored");

        ArrayList<String> wagon = new ArrayList<>();

        while (true) {
            System.out.println("Доступні товари в магазині:");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + "." + products.get(i));
            }

//            for (String product : products) {
//                System.out.println(product);
//            }
//            Спочатку вирішив використовувати foreach,
//            але виглядало б не зрозуміло яка нумерація у товарів

            System.out.println("\nВиберіть дію:");
            System.out.println("1 - Додати товар до кошика");
            System.out.println("2 - Переглянути вміст кошика");
            System.out.println("3 - Видалити з кошика");
            System.out.println("4 - Вихід з магазину");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nОберіть товар за номером: ");
                    int numProd = scanner.nextInt() - 1;
                    if (numProd >= 0 && numProd < products.size()) {
                        wagon.add(products.get(numProd));
                        System.out.println(products.get(numProd) + " додано до кошика.\n");
                        products.remove(numProd);
                    } else {
                        System.out.println("Некоректний номер товару.");
                    }
                    break;

                case 2:
                    System.out.println("\nВаш кошик:");
                    if (wagon.isEmpty()) {
                        System.out.println("Кошик порожній.\n");
                    } else {
                        for (int i = 0; i < wagon.size(); i++) {
                            System.out.println((i + 1) + "." + wagon.get(i));
                            System.out.println();
                        }

//                        Тут також використовував ітераційний цикл для більшої зрозумілості позицій
//                        які перебувають у кошику
//                        for (String item : wagon) {
//                            System.out.println(item + "\n");
//                        }
                    }
                    break;

                case 3:
                    if (wagon.isEmpty()) {
                        System.out.println("Немає що прибирати, кошик порошній.\n");
                    } else {
                        if (wagon.size() == 1) {
                            System.out.println("\nВаш кошик на цю хвилину складаэться з " + wagon.size() + " позиції.");
                        } else {
                            System.out.println("\nВаш кошик на цю хвилину складаэться з " + wagon.size() + " позицій.");
                        }

                        for (int i = 0; i < wagon.size(); i++) {
                            System.out.println((i + 1) + "." + wagon.get(i));
                        }

//                        Ось тут також використав ітераційний, щоб користувач розумів
//                        яку позицію він може обрати для прибирання з кошика
//                        for (String wag : wagon) {
//                            System.out.println(wag);
//                        }

                        System.out.print("\nОберіть товар по номеру для видалення: ");
                        int delProd = scanner.nextInt() - 1;
                        if (delProd >= 0 && delProd <= wagon.size()) {
                            System.out.println(wagon.get(delProd) + " видалено з кошика.\n");
                            products.add(wagon.get(delProd));
                            wagon.remove(delProd);
                        } else {
                            System.out.println("Некоректний номер.");
                        }

                        if (wagon.isEmpty()) {
                            System.out.println("Кошик після видалення позиції став порожнім.\n");
                        } else {
                            System.out.println("Кошик після видалення став на " + wagon.size() + " позицій.\n");
                            for (int i = 0; i < wagon.size(); i++) {
                                System.out.println((i + 1) + "." + wagon.get(i));
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nДякуємо за відвідування магазину!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nНекоректний вибір!\n");
            }
        }
    }
}
