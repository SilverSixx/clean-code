package DesignPattern.CreationalPattern.Prototype;

public class EmailNotification implements Notification{

    private String email;

    public EmailNotification(String email){
        this.email = email;
    }

    @Override
    public Notification clone() throws CloneNotSupportedException {
        return new EmailNotification(this.email);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to: " + this.email);
    }
}
