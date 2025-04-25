package Lab10.Task5;

public abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}
