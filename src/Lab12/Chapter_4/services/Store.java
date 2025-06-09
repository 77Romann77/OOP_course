package Lab12.Chapter_4.services;

import Lab12.Chapter_4.models.*;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static final List<BaseProduct> products = new ArrayList<>(
            List.of(
                new MouseProduct("Миша Hator Quasar 3 Ultra 8K Wireless Black", 3499, 1, "PixArt"),
                new HeadphonesProduct("Навушники Hator Hypergang 3 Wireless Black ", 5499, 2, "Wireless"),
                new CarpetProduct("Ігрова поверхня Hator Tonn eSport Monte Edition 3XL Speed/Control Multicolored", 1399, 3, 1000, 500),
                new KeyboardProduct("Клавіатура Hator Rockfall 3 Mecha TKL Wireless", 3799, 4, 87)
            )
    );

    public static final List<BaseProduct> wagon = new ArrayList<>();

    public static void showProducts() {
        System.out.println("Доступні товари в магазині:");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).getDescription();
        }
    }
}
