package Lab12.Chapter_4.models;

import Lab12.Chapter_4.interfaces.Discountable;

public class HeadphonesProduct extends BaseProduct implements Discountable {
    private final String type;
    private boolean discountApplied = false;
    private double discountedPrice;

    public HeadphonesProduct(String name, double price, int id, String type) {
        super(name, price, id);
        this.type = type;
        this.discountedPrice = price;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: " + price + "₴" +
                "\nСенсор: " + type);
    }

    @Override
    public void applyDiscount(double percent) {
        if (!discountApplied) {
            discountedPrice = price - (price * percent / 100);
            discountApplied = true;
            System.out.println("Ціна після знижки на товар становить: " + discountedPrice);
            System.out.println();
        } else {
            System.out.println("Знижку вже було застосовано до товару.");
        }
    }

}