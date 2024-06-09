package DesignPattern.BehavioralPattern.Strategy;

public class VNPayPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using VNPay");
    }
}
