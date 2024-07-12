public class Customer extends User {
    // Additional attributes specific to Customer
    private String membershipLevel;
    private double accountBalance;
    private Car customerCar; // Reference to Customer's Car
    
    // Constructor
    public Customer(String userName, int userId, String userAddress, String userPhone, String membershipLevel, double accountBalance, Car customerCar) {
        super(userName, userId, userAddress, userPhone); // Call to superclass constructor
        this.membershipLevel = membershipLevel;
        this.accountBalance = accountBalance;
        this.customerCar = customerCar;
    }
    
    // Getter and Setter methods specific to Customer
    public String getMembershipLevel() {
        return membershipLevel;
    }
    
    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public Car getCustomerCar() {
        return customerCar;
    }
    
    public void setCustomerCar(Car customerCar) {
        this.customerCar = customerCar;
    }
    
    // Additional method specific to Customer
    public void displayCustomerInfo() {
        super.registerUser(); // Registering User
        System.out.println("Customer ID: " + getUserId());
        System.out.println("Customer Name: " + getUserName());
        System.out.println("Membership Level: " + membershipLevel);
        System.out.println("Account Balance: KES " + accountBalance);
        System.out.print("Car Information: ");
        customerCar.displayCarInfo();
    }
}
