package DesignPattern.CreationalPattern.AbstractFactory;

public class PremiumSMSSender implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending premium SMS notification");
    }
}
