package DesignPattern.StructuralPattern.Adapter;

public class ThirdPartyMailSender {
    public void sendMail(String message) {
        System.out.println("Sending mail: " + message);
    }
}
