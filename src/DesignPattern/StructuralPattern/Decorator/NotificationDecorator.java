package DesignPattern.StructuralPattern.Decorator;

public abstract class NotificationDecorator implements Notification {
    private final Notification wrapped;

    public NotificationDecorator(Notification notification) {
        this.wrapped = notification;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
