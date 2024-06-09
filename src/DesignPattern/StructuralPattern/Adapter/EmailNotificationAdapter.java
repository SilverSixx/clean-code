package DesignPattern.StructuralPattern.Adapter;

public class EmailNotificationAdapter implements Notification{

    private final ThirdPartyMailSender thirdPartyMailSender;

    public EmailNotificationAdapter(ThirdPartyMailSender thirdPartyMailSender) {
        this.thirdPartyMailSender = thirdPartyMailSender;
    }

    @Override
    public void send(String message) {
        thirdPartyMailSender.sendMail(message);
    }
}
