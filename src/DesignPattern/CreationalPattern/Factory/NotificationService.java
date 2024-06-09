package DesignPattern.CreationalPattern.Factory;

public class NotificationService {
    private final NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(String channel) {
        // this is the factory method that creates the concrete product based on the input
        // and then calls the method on the product object to do the job
        // this is the factory method pattern in action
        Notification notification = notificationFactory.createNotification(channel);
        if (notification != null) {
            notification.notifyUser();
        }
    }

}
