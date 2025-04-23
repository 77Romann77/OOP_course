package Lab9.Task5_Extra;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
