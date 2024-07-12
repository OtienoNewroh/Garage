public class User {
    // Attributes
    private String userName;
    private int userId;
    private String userAddress;
    private String userPhone;
    
    // Constructor
    public User(String userName, int userId, String userAddress, String userPhone) {
        this.userName = userName;
        this.userId = userId;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }
    
    // Getter and Setter methods
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserAddress() {
        return userAddress;
    }
    
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
    public String getUserPhone() {
        return userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    // Method
    public void registerUser() {
        System.out.println("User " + userName + " registered successfully.");
    }
}
