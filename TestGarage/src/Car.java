public class Car {
    // Attributes
    private String carBrand;
    private String carModel;
    private String carColor;
    private String carLicensePlate;
    
    // Constructor
    public Car(String carBrand, String carModel, String carColor, String carLicensePlate) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carLicensePlate = carLicensePlate;
    }
    
    // Getter and Setter methods
    public String getCarBrand() {
        return carBrand;
    }
    
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    
    public String getCarModel() {
        return carModel;
    }
    
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    
    public String getCarColor() {
        return carColor;
    }
    
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    
    public String getCarLicensePlate() {
        return carLicensePlate;
    }
    
    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }
    
    // Method
    public void registerCar() {
        System.out.println("Car " + carBrand + " " + carModel + " " + carLicensePlate + " +registered successfully.");
    }

    public void displayCarInfo() {
        System.out.println("Car: " + carBrand + " " + carModel + ", Color: " + carColor + ", License Plate: " + carLicensePlate);
    }


}
