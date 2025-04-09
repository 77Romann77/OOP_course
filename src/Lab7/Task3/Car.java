package Lab7.Task3;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Щвидкість не може бути від'ємною!!!");
        }
    }

    public void accelerate(int value) {
        speed += value;
        System.out.println("Швидкість авто після прискорення " + speed);
    }

    public void brake(int value) {
        if (speed >= value) {
            speed -= value;
            System.out.println("Швидкість авто після гальмування " + speed);
        } else {
            System.out.println("Швидкість нашо авто не можу бути від'ємною!!!");
        }
    }
}
