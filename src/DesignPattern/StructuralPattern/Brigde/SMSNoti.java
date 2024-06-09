package DesignPattern.StructuralPattern.Brigde;

public class SMSNoti extends Notification {

    public SMSNoti(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendNotification("SMS: " + message);
    }
}