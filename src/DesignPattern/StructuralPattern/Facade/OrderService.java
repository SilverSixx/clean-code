package DesignPattern.StructuralPattern.Facade;

public class OrderService {

    public void placeOrder(String product, int quantity) {
        System.out.println("Order placed for product: " + product + ", quantity: " + quantity);
    }

}
