public class Main {
    private static ServiceOrder serviceOrder;

    public static void main(String[] args) {
        // Create an Employee
        Employee employee = new Employee("Jeph", 200, "456 Office St", "555-5678", "IT", 100000.0);
        employee.registerUser();
        employee.displayEmployeeInfo();
        
        System.out.println();
        
        // Create a Car for the Customer
        Car customerCar = new Car("Toyota", "Camry", "Silver", "ABC123");
        
        // Create a Customer with the Car
        Customer customer = new Customer("Jeph Kaudo", 2001, "123 Main St", "555-1234", "Gold", 500.0, customerCar);
        customer.registerUser(); // Method from User class
        customer.displayCustomerInfo(); // Method from Customer class

        System.out.println();
        
        // Create a Technician
        Technician technician = new Technician(1677, "Mtambo Chuma", "Mechanic");
        technician.displayTechnicianInfo(); // Method from Technician class
        
        System.out.println();
        
        // Create a ServiceOrder for the Customer
        ServiceOrder order = new ServiceOrder(1001, "2024-07-03", "Order details here", customer.getUserId(), customerCar);
        order.createOrder(); // Method from ServiceOrder class
        
        System.out.println();
        
        // Assign the Technician to the ServiceOrder
        order.assignTechnician(technician); // Method from ServiceOrder class

        // Create parts and add them to inventory
        Part part1 = new Part("P001", "Engine Oil", 50, 15.99);
        Part part2 = new Part("P002", "Brake Pads", 20, 39.99);
 
        Inventory inventory = new Inventory();
        inventory.addPart(part1);
        inventory.addPart(part2);

        // Create a Quality Assurance instance
        QualityAssurance qaPersonnel = new QualityAssurance(2001, "Ken Jay");

        // Link Quality Assurance to the Service Order
        qaPersonnel.linkToServiceOrder(serviceOrder);

        // Perform quality checks specific to the Service Order
        qaPersonnel.performQualityCheck();

        // Report quality status specific to the Service Order
        qaPersonnel.reportQualityStatus();
        
        // Generate Billing for the ServiceOrder
        double amount = 1050.0; // Example amount
        order.generateBilling(amount); // Method from ServiceOrder class
        
        System.out.println();
        
        // Display Billing Information
        order.displayBillingInfo(); // Method from ServiceOrder class
    }
}
