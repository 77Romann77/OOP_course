package Lab10_2;

public class NotificationReader extends Consumer{
    public int lastReadCounter = 0;
    @Override
    public void ReadNewMessage() {
        if (lastReadCounter >= Notification.count) {
            System.out.println("No new messages.");
            return;
        }

        System.out.println("Reading new messages:");
        while (lastReadCounter < Notification.count) {
            System.out.println(Notification.messages[lastReadCounter++]);
        }
    }
}
