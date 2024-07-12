public class Employee extends User {
    // Additional attributes specific to Employee
    private String department;
    protected static double salary;
    
    // Constructor
    public Employee(String userName, int userId, String userAddress, String userPhone, String department, double salary) {
        super(userName, userId, userAddress, userPhone); // Call to superclass constructor
        this.department = department;
        Employee.salary = salary;
    }
    
    // Getter and Setter methods specific to Employee
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        Employee.salary = salary;
    }
    
    // Additional method specific to Employee
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + getUserId());
        System.out.println("Employee Name: " + getUserName());
        System.out.println("Department: " + department);
        System.out.println("Salary: KES " + salary);
    }
}
