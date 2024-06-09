package DesignPattern.CreationalPattern.AbstractFactory;

public class BasicSMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending basic SMS notification");
    }
}
