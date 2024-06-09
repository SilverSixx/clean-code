package DesignPattern.StructuralPattern.Brigde;

public class WebNotiSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Web: " + message);
    }
}
