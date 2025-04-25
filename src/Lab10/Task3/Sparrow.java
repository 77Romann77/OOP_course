package Lab10.Task3;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("cheep-cheep-cheep");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
