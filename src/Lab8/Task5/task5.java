package Lab8.Task5;

public class task5 {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println("Phone");
        phone.makeCall();
        phone.turnOn();
        System.out.println();

        System.out.println("Tablet");
        tablet.watchVideo();
        tablet.turnOn();
        System.out.println();

        System.out.println("SmartPhone");
        smartPhone.makeCall();
        smartPhone.turnOn();
        smartPhone.browseInternet();
    }
}
