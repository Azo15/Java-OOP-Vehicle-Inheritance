public class Car extends Vehicle {

    private String doors;

    // Parametreli yapıcı
    public Car(String brand, String year, String doors) {
        super(brand, year); // Üst sınıftaki brand ve year'ı çağırır
        this.doors = doors;
    }

    // Boş yapıcı
    public Car() {
        super();
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String displayInfo() {
        return "Brand: " + brand + ", Year: " + year + ", Doors: " + doors;
    }
}
