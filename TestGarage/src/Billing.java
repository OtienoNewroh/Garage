public class Billing {
    // Attributes
    private int billingId;
    private int orderId;
    private double amount;
    
    // Constructor
    public Billing(int billingId, int orderId, double amount) {
        this.billingId = billingId;
        this.orderId = orderId;
        this.amount = amount;
    }
    
    // Getter methods
    public int getBillingId() {
        return billingId;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public double getAmount() {
        return amount;
    }
    
    // Method to display Billing information
    public void generateBill() {
        System.out.println("Billing ID: " + billingId);
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: KES" + amount);
        System.out.println("Bill generated successfully.");
    }
}
