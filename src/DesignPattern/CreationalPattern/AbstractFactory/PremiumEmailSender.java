package DesignPattern.CreationalPattern.AbstractFactory;

public class PremiumEmailSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending premium email notification");
    }
}
