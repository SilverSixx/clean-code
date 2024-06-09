package DesignPattern.StructuralPattern.Adapter;

public class SMSNotificationAdapter implements Notification {

    private final ThirdPartySMSSender thirdPartySMSSender;

    public SMSNotificationAdapter(ThirdPartySMSSender thirdPartySMSSender) {
        this.thirdPartySMSSender = thirdPartySMSSender;
    }

    @Override
    public void send(String message) {
        thirdPartySMSSender.sendSMS(message);
    }
}
