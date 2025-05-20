package Lab10_2;

public class Main {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();
        PushNotification pushNotification = new PushNotification();

        Notification[] notifications = new Notification[3];

        notifications[0] = emailNotification;
        notifications[1] = smsNotification;
        notifications[2] = pushNotification;

        for (Notification not : notifications) {
            not.send("Soo hard!!!");
        }


        NotificationReader reader = new NotificationReader();
        reader.ReadNewMessage();

        notifications[0].send("Second email message.");
        notifications[2].send("Another push alert!");
        notifications[1].send("First SMS");

        reader.ReadNewMessage();
    }
}
