package Lexcon;

public class Order {

    private int orderId;
    private Product product;
    private int quantity;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return product.getPrice() * quantity;
    }

    public String getOrderInfo() {
        return "Order ID: " + orderId + ", Total: " + calculateTotalPrice();
    }

    public int getOrderId() {
        return orderId;
    }
}