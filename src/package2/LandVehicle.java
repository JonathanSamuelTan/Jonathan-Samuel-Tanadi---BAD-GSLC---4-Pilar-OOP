package package2;
import package1.Vehicle;

public class LandVehicle extends Vehicle{
    private int numberOfWheels;
    private String fuelType;


    public LandVehicle(String brand, String name, int maxPassengers, double price, int manufactureYear, int numberOfWheels, String fuelType) {
        super(brand, name, maxPassengers, price, manufactureYear);
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }

    public void turnOnSignalLights() {
        System.out.println("Signal lights turned on");
    }

    public void honk() {
        System.out.println("Land Vehicle : Honk honk");
    }

    @Override
    public void startEngine() {
        System.out.println("LandVehicle started");
    }

    @Override
    public void stopEngine() {
        System.out.println("LandVehicle stopped");
    }
    
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels > 0) {
            this.numberOfWheels = numberOfWheels;
        }
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
