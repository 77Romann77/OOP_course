package Lab12.Chapter_4.models;

public class CarpetProduct extends BaseProduct {
    private final int height;
    private final int width;

    public CarpetProduct(String name, double price, int id, int height, int width){
        super(name, price, id);
        this.height = height;
        this.width = width;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: " + price + "₴" +
                "\nШирина: " + height +
                "\nВисота: " + width);
    }
}