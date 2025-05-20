package Lab10_2;

public abstract class Notification implements Producer {
    public static String[] messages = new String[100];
    public static int count = 0;

    @Override
    public void send(String message) {
        messages[count++] = "[" + getType() + "] " + message;
        System.out.println("Sending" + getType() + ": " + message);
    }

    // getType() це функція яка буде наслідуватися
    // та використовуватися для відтворення типів повідомлення
    public abstract String getType();
}