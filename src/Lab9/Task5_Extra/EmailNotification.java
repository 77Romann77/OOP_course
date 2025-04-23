package Lab9.Task5_Extra;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
