package DesignPattern.CreationalPattern.AbstractFactory;

public class PremiumNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PremiumSMSNotification();
    }

    @Override
    public NotificationSender createNotificationSender() {
        return new PremiumSMSSender();
    }
}
