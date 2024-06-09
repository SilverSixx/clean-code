package DesignPattern.StructuralPattern.Facade;

public class OrderFacade {
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String product, int quantity, String paymentType, double amount) {
        orderService.placeOrder(product, quantity);
        paymentService.processPayment(paymentType, amount);
        shippingService.shipProduct(product);
    }
}

