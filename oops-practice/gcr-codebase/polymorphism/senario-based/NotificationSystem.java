class Notification {

    String recipientName;
    String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

// Email Notification
class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
        System.out.println();
    }
}

// SMS Notification
class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
        System.out.println();
    }
}

// Push Notification
class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
        System.out.println();
    }
}

// Main Class
public class NotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("Priyanshu", "Welcome to our service!"),
            new SMSNotification("Rahul", "Your OTP is 456789"),
            new PushNotification("Ankit", "You have a new friend request"),
            new EmailNotification("Neha", "Your account has been verified")
        };

        System.out.println("----- Notifications Sent -----\n");

        // Dynamic Method Dispatch
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}