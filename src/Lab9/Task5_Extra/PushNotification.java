package Lab9.Task5_Extra;

public class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
