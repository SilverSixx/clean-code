package DesignPattern.StructuralPattern.Adapter;

public class ThirdPartySMSSender {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
