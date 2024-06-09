package DesignPattern.StructuralPattern.Decorator;

public class BasicNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
