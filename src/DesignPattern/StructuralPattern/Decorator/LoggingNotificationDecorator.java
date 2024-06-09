package DesignPattern.StructuralPattern.Decorator;

public class LoggingNotificationDecorator extends NotificationDecorator{
    public LoggingNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging message: " + message);
        super.send(message);
    }

}
