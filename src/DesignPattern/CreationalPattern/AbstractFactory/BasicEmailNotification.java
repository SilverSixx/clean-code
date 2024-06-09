package DesignPattern.CreationalPattern.AbstractFactory;

public class BasicEmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending basic email notification");
    }
}
