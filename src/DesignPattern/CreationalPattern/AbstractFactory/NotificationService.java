package DesignPattern.CreationalPattern.AbstractFactory;

public class NotificationService {
    private NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification() {
        Notification notification = notificationFactory.createNotification();
        NotificationSender notificationSender = notificationFactory.createNotificationSender();
        notification.notifyUser();
        notificationSender.sendNotification();
    }
}
