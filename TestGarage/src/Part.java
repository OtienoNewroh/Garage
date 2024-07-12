public class Part {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Part(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Method to update quantity when parts are retrieved
    public void updateQuantity(int amount) {
        this.quantity -= amount;
    }
}
