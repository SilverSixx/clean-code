package DesignPattern.StructuralPattern.Brigde;

public class EmailNoti extends Notification {
    public EmailNoti(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendNotification("Email: " + message);
    }
}
