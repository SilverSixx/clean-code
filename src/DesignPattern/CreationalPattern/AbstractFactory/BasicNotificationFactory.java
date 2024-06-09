package DesignPattern.CreationalPattern.AbstractFactory;

public class BasicNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new BasicEmailNotification();
    }

    @Override
    public NotificationSender createNotificationSender() {
        return new BasicEmailSender();
    }
}
