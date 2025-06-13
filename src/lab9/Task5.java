package lab9;

public class Task5 {
    static class Notification {
        public void send(String message) {
            System.out.println("Sending generic notification: " + message);
        }
    }

    static class EmailNotification extends Notification {
        @Override
        public void send(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    static class SMSNotification extends Notification {
        @Override
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    static class PushNotification extends Notification {
        @Override
        public void send(String message) {
            System.out.println("Sending push notification: " + message);
        }
    }

    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification n : notifications) {
            n.send("Hello, user!");
        }
    }
}
