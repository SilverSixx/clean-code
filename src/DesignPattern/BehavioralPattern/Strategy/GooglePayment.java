package DesignPattern.BehavioralPattern.Strategy;

public class GooglePayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Google Payment");
    }
}
