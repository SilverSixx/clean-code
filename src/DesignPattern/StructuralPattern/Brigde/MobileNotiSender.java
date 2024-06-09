package DesignPattern.StructuralPattern.Brigde;

public class MobileNotiSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Mobile: " + message);
    }
}
