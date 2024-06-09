package DesignPattern.StructuralPattern.Decorator;

public class NotificationService {

    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}
