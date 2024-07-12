public class QualityAssurance {
    private int qaId;
    private String qaName;
    private ServiceOrder serviceOrder; // Link to Service Order

    public QualityAssurance(int qaId, String qaName) {
        this.qaId = qaId;
        this.qaName = qaName;
    }

    // Method to link Quality Assurance to a Service Order
    public void linkToServiceOrder(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public void performQualityCheck() {
        // Perform quality checks specific to the linked Service Order
        if (serviceOrder != null) {
            System.out.println("Quality Assurance personnel " + qaName + " is performing quality checks for Service Order ID: " + serviceOrder.getOrderId());
            // Implement actual quality check logic here
        } else {
            System.out.println("No Service Order linked. Cannot perform quality checks.");
        }
    }

    public void reportQualityStatus() {
        // Report quality status specific to the linked Service Order
        if (serviceOrder != null) {
            System.out.println("Quality Assurance personnel " + qaName + " is reporting quality status for Service Order ID: " + serviceOrder.getOrderId());
            // Implement actual reporting logic here
        } else {
            System.out.println("No Service Order linked. Cannot report quality status.");
        }
    }

    // Getters and Setters
    public int getQaId() {
        return qaId;
    }

    public void setQaId(int qaId) {
        this.qaId = qaId;
    }

    public String getQaName() {
        return qaName;
    }

    public void setQaName(String qaName) {
        this.qaName = qaName;
    }
}
