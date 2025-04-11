package Lab8.Task3;

public class Dog extends Mammal {

    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Bark " + name);
    }
}
