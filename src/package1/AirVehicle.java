package package1;

public class AirVehicle extends Vehicle{
    int numberOfEngines;
    double maxAltitude;

    public AirVehicle(String brand, String name, int maxPassengers, double price, int manufactureYear, int numberOfEngines, double maxAltitude) {
        super(brand, name, maxPassengers, price, manufactureYear);
        this.numberOfEngines =  numberOfEngines;
        this.maxAltitude = maxAltitude;
    }

    public void takeoff() {
        System.out.println("AirVehicle took off");
    }

    public void land() {
        System.out.println("AirVehicle landed");
    }

    @Override
    public void startEngine() {
        System.out.println("AirVehicle started");
    }

    @Override
    public void stopEngine() {
        System.out.println("AirVehicle stopped");
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        if (numberOfEngines > 0) {
            this.numberOfEngines = numberOfEngines;
        }
    }

    public void setMaxAltitude(double maxAltitude) {
        if (maxAltitude > 0) {
            this.maxAltitude = maxAltitude;
        }
    }
}
