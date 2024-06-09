package DesignPattern.StructuralPattern.Decorator;

public class EncryptionNotificationDecorator extends NotificationDecorator{
    public EncryptionNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        message = encrypt(message);
        System.out.println("Encrypting message: " + message);
        super.send(message);
    }

    private String encrypt(String message) {
        // Simple encryption logic for demonstration
        return new StringBuilder(message).reverse().toString();
    }
}
