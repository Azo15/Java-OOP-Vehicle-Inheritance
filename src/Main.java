public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "2016", "4");
        System.out.println(car.displayInfo());

        Bike bike = new Bike("Salcano", "2022", "Mountain");
        System.out.println(bike.displayInfo());
    }
}
