package DesignPattern.StructuralPattern.Facade;

public class PaymentService {
    public void processPayment(String paymentType, double amount) {
        System.out.println("Payment processed: " + paymentType + ", amount: " + amount);
    }
}
