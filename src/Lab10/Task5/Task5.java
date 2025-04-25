package Lab10.Task5;

public class Task5 {
    public static void main(String[] args) {
        WasherDryer washerdryer = new WasherDryer("Samsung");

        washerdryer.turnOn();
        washerdryer.wash();
        washerdryer.dry();

        System.out.println();
        System.out.println("Демонстрація поліморфізму об'єкт WasherDryer , " +
                "який може бути присвоєний змінній типу Appliance, Washable або Dryable");
        Appliance appliance = washerdryer;
        Washable washable = washerdryer;
        Dryable dryable = washerdryer;

        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
