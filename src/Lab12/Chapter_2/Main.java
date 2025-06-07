package Lab12.Chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<String> products = new ArrayList<>();
    static final ArrayList<String> wagon = new ArrayList<>();



    public static void main(String[] args) {

        System.out.println("\nДоброго дня!!!");
        System.out.println("Вас вітає магазин ігрової периферії HATOR\n");

        products.add("Навушники Hator Hypergang 3 Wireless Black ");
        products.add("Клавіатура Hator Rockfall 3 Mecha TKL Wireless");
        products.add("Миша Hator Quasar 3 Ultra 8K Wireless Black");
        products.add("Ігрова поверхня Hator Tonn eSport Monte Edition 3XL Speed/Control Multicolored");

        while (true) {
            showProducts();
            showMenu();
            int choice = getUserInput();
            handleUserChoice(choice);
        }

    }

    //    метод для виводу списку товарів
    public static void showProducts() {
        System.out.println("Доступні товари в магазині:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "." + products.get(i));
        }
    }

    //    метод для додавання товару в кошик
    public static void addWagon() {
        System.out.print("\nОберіть товар за номером: ");
        int numProd = scanner.nextInt() - 1;
        if (numProd >= 0 && numProd < products.size()) {
            wagon.add(products.get(numProd));
            System.out.println(products.get(numProd) + " додано до кошика.\n");
            products.remove(numProd);
        } else {
            System.out.println("Некоректний номер товару.");
        }
    }

    //    метод для перегляду кошика
    public static void showWagon() {
        System.out.println("\nВаш кошик:");
        if (wagon.isEmpty()) {
            System.out.println("Кошик порожній.\n");
        } else {
            for (int i = 0; i < wagon.size(); i++) {
                System.out.println((i + 1) + "." + wagon.get(i));
                System.out.println();
            }
        }
    }

    //    метод для обробки введення користувача
    public static int getUserInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний вхід. Введіть номер.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    //    метод для відображення меню
    public static void showMenu() {
        System.out.println("\nВиберіть дію:");
        System.out.println("1 - Додати товар до кошика");
        System.out.println("2 - Переглянути вміст кошика");
        System.out.println("3 - Видалити з кошика");
        System.out.println("4 - Вихід з магазину");
    }

    public static void handleUserChoice(int choise) {
        scanner.nextLine();
        switch (choise) {
            case 1 -> addWagon();
            case 2 -> showWagon();
            case 3 -> delProd();
            case 4 -> exitMarket();
            default -> System.out.println("\nНекоректний вибір!\n");
        }
    }


    public static void delProd() {
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
    }

    public static void exitMarket() {
        System.out.println("\nДякуємо за відвідування магазину!");
        scanner.close();
        System.exit(0);
    }
}

