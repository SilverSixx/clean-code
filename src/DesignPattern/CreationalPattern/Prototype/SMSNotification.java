package DesignPattern.CreationalPattern.Prototype;

public class SMSNotification implements Notification{

    private String phoneNumber;

    public SMSNotification(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Notification clone() throws CloneNotSupportedException {
        return new SMSNotification(this.phoneNumber);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to: " + this.phoneNumber);
    }
}
