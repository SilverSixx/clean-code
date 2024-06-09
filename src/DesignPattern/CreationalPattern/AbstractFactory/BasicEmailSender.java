package DesignPattern.CreationalPattern.AbstractFactory;

public class BasicEmailSender implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending basic email notification");
    }
}
