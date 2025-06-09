package Lab12.Chapter_4.models;

public abstract class BaseProduct {
    protected String name;
    protected double price;
    protected int id;

    public BaseProduct(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public abstract void getDescription();

    public void displayInfo() {
        System.out.println("Назва продукту:" + name +
                "\nЦіна:" + price + "₴" +
                "\nEAN: " + id);
    }

    public String getName() {
        return name;
    }
}
