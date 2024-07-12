public class ServiceOrder {
    // Attributes
    private int orderId;
    private String orderDate;
    private String orderDetails;
    private int userId; // Foreign key relationship to User
    private Car customerCar; // Reference to Customer's Car
    private Technician assignedTechnician; // Reference to assigned Technician
    private Billing billing; // Reference to Billing
    
    // Constructor
    public ServiceOrder(int orderId, String orderDate, String orderDetails, int userId, Car customerCar) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.userId = userId;
        this.customerCar = customerCar;
        this.assignedTechnician = null; // Initialize assigned technician as null initially
        this.billing = null; // Initialize billing as null initially
    }
    
    // Getter and Setter methods
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public String getOrderDate() {
        return orderDate;
    }
    
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    public String getOrderDetails() {
        return orderDetails;
    }
    
    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public Car getCustomerCar() {
        return customerCar;
    }
    
    public void setCustomerCar(Car customerCar) {
        this.customerCar = customerCar;
    }
    
    public Technician getAssignedTechnician() {
        return assignedTechnician;
    }
    
    public void setAssignedTechnician(Technician assignedTechnician) {
        this.assignedTechnician = assignedTechnician;
    }

    public Billing getBilling() {
        return billing;
    }
    
    public void setBilling(Billing billing) {
        this.billing = billing;
    }
    
    // Methods
    public void createOrder() {
        System.out.println("Order " + orderId + " created successfully.");
    }
    
    public void cancelOrder() {
        System.out.println("Order " + orderId + " cancelled.");
    }
    
    // Method to assign a Technician to the ServiceOrder
    public void assignTechnician(Technician technician) {
        this.assignedTechnician = technician;
        System.out.println("Technician " + technician.getEmployeeName() + " assigned to Order " + orderId);
    }
    
    // Method to generate Billing
    public void generateBilling(double amount) {
        // Generate a unique billing ID (you may use your own logic for generating billing ID)
        int billingId = (int) (Math.random() * 1000);
        this.billing = new Billing(billingId, orderId, amount);
    }
    
    // Method to display Billing information
    public void displayBillingInfo() {
        if (billing != null) {
            billing.generateBill();
        } else {
            System.out.println("No billing information available for Order ID: " + orderId);
        }
    }
}
