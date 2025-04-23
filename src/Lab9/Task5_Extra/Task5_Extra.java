package Lab9.Task5_Extra;

import java.util.Scanner;

public class Task5_Extra {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        email.send(getMessage(email));
        Notification sms = new SMSNotification();
        sms.send(getMessage(sms));
        Notification push = new PushNotification();
        push.send(getMessage(push));
    }

    public static String getMessage(Notification notification) {
        String name = notification.getClass().getName();
        System.out.print("Enter " + name.substring(name.lastIndexOf('.') + 1) + ": ");
        return scanner.nextLine();
    }
}
