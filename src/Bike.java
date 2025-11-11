public class Bike extends Vehicle {

    private String type;

    public Bike(String brand, String year, String type) {
        super(brand, year);
        this.type = type;
    }

    public Bike() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String displayInfo() {
        return "Brand: " + brand + ", Year: " + year + ", Type: " + type;
    }
}
