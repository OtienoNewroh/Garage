public class Technician {
    private int employeeId;
    private String employeeName;
    private String specialization;
    
    // Constructor
    public Technician(int employeeId, String employeeName, String specialization) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.specialization = specialization;
    }
    
    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }
    
    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
    
    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }
    
    // Display technician information
    public void displayTechnicianInfo() {
        System.out.println("Technician ID: " + employeeId);
        System.out.println("Technician Name: " + employeeName);
        System.out.println("Specialization: " + specialization);
    }

     // Method for technician to request a part
     public void requestPart(Inventory inventory, String partNumber, int amount) {
        // Simulate requesting a part
        System.out.println(employeeName + " is requesting part " + partNumber + " (Amount: " + amount + ")");
        
        // Retrieve the part from inventory
        inventory.retrievePart(partNumber, amount);
    }
}
