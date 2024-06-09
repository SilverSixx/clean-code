package DesignPattern.CreationalPattern.AbstractFactory;

public class PremiumSMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending premium SMS notification");
    }
}
