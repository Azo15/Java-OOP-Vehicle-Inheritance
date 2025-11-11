public class Vehicle {

    protected String brand;
    protected String year;

    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String displayInfo() {
        return "Brand: " + brand + ", Year: " + year;
    }
}
