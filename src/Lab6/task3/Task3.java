package Lab6.task3;

public class Task3 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Тімофей";
        cat.sound = "Мяу!!!";

        Animal parot = new Animal();
        parot.name = "Кеша";
        parot.sound = "Чік-чірік!!!";

        Animal frog = new Animal();
        frog.name = "Геннадій";
        frog.sound = "ribbit-ribbit!!!";

        Animal[] animals = {cat , parot , frog};

        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
