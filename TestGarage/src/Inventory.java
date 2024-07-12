import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Part> parts;

    public Inventory() {
        this.parts = new ArrayList<>();
    }

    // Method to add a new part to the inventory
    public void addPart(Part part) {
        parts.add(part);
    }

    // Method to retrieve a part by its part number
    public Part findPart(String partNumber) {
        for (Part part : parts) {
            if (part.getPartNumber().equals(partNumber)) {
                return part;
            }
        }
        return null; // Part not found
    }

    // Method to update quantity of a part when retrieved
    public void retrievePart(String partNumber, int amount) {
        Part part = findPart(partNumber);
        if (part != null && part.getQuantity() >= amount) {
            part.updateQuantity(amount);
            System.out.println("Part " + part.getDescription() + " retrieved successfully.");
        } else {
            System.out.println("Error: Part not found or insufficient quantity.");
        }
    }
}
