package Lab9.Task5;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
