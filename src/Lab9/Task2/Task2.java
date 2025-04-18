package Lab9.Task2;

public class Task2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[2];

        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
