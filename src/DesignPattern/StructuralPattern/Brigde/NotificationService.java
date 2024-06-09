package DesignPattern.StructuralPattern.Brigde;

public class NotificationService {

    private final Notification mailNotification;
    private final Notification smsNotification;

    public NotificationService(Notification mailNotification, Notification smsNotification) {
        this.mailNotification = mailNotification;
        this.smsNotification = smsNotification;
    }

    public void sendMail(String message) {
        mailNotification.send(message);
    }

    public void sendSMS(String message) {
        smsNotification.send(message);
    }

}
