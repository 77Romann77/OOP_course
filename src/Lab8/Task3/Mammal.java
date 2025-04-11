package Lab8.Task3;

public class Mammal extends Animal {

    Mammal(String name) {
        super(name);
    }

    void walk() {
        System.out.println("Walking " + name);
    }
}
