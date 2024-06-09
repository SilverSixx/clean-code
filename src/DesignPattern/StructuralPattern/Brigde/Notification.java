package DesignPattern.StructuralPattern.Brigde;

public abstract class Notification {
    protected NotificationSender sender;

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);
}

