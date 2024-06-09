package DesignPattern.CreationalPattern.AbstractFactory;

// this is the abstract factory
public interface NotificationFactory {
    Notification createNotification();
    NotificationSender createNotificationSender();
}
