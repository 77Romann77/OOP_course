package Lab12.Chapter_4.models;

public class MouseProduct extends BaseProduct {
    private final String sensor;

    public MouseProduct(String name, double price, int id, String sensor) {
        super(name, price, id);
        this.sensor = sensor;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: "+ price + "₴" +
                "\nСенсор: " + sensor );
    }
}