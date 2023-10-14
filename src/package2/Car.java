package package2;

public class Car extends LandVehicle {
    private String type;
    private int doors;

    public Car(String brand, String name, int maxPassengers, double price, int manufactureYear, int numberOfWheels,
            String fuelType, String type, int doors) {
        super(brand, name, maxPassengers, price, manufactureYear, numberOfWheels, fuelType);
        this.type = type;
        this.doors = doors;
    }

    public void moveReverse() {
        System.out.println("Car : Moving reverse");
    }

    public void turnOnAC() {
        System.out.println("Car : AC turned on");
    }

    @Override
    public void startEngine() {
        System.out.println("Car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopped");
    }

    @Override
    public void honk() {
        System.out.println("Car : Honk honk");
    }

    @Override
    public void turnOnSignalLights() {
        System.out.println("Car : Signal lights turned on");
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
