package DesignPattern.CreationalPattern.AbstractFactory;

public class BasicSMSSender implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending basic SMS notification");
    }
}
