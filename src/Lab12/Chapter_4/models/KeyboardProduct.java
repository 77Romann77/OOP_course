package Lab12.Chapter_4.models;

public class KeyboardProduct extends BaseProduct {
    private final int keys;

    public KeyboardProduct(String name, double price, int id, int keys){
        super(name, price, id);
        this.keys = keys;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: " + price + "₴" +
                "\nКількість клавіш: " + keys);
    }
}
