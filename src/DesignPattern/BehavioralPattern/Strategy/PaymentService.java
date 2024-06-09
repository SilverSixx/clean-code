package DesignPattern.BehavioralPattern.Strategy;

public class PaymentService {

    private final PaymentContext paymentContext;

    public PaymentService(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    public void pay(int amount, String paymentMethod) {
        PaymentStrategy paymentStrategy;
        switch (paymentMethod) {
            case "CreditCard":
                paymentStrategy = new CreditCardPayment();
                break;
            case "VNPay":
                paymentStrategy = new VNPayPayment();
                break;
            case "GooglePay":
                paymentStrategy = new GooglePayment();
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
        paymentContext.setPaymentStrategy(paymentStrategy);
        paymentContext.pay(amount);
    }

}
