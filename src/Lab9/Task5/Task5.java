package Lab9.Task5;

public class Task5 {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();
        PushNotification pushNotification = new PushNotification();

        Notification[] notifications = new Notification[3];

        notifications[0] = emailNotification;
        notifications[1] = smsNotification;
        notifications[2] = pushNotification;

        for (Notification notification : notifications) {
            notification.send("Hello, user!");
        }
    }
}
