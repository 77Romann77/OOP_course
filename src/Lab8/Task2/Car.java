package Lab8.Task2;

public class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    void accelerate() {
        speed += 10;
    }
}
