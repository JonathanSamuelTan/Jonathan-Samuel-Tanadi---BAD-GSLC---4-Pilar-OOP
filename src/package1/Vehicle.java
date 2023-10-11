package package1;

public class Vehicle {
    private String brand;
    private String name;
    private int maxPassengers;
    private double price;
    private int manufactureYear;

    public Vehicle(String brand, String name, int maxPassengers, double price, int manufactureYear) {
        this.brand = brand;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.price = price;
        this.manufactureYear = manufactureYear;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getPrice() {
        return price;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers > 0) {
            this.maxPassengers = maxPassengers;
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setManufactureYear(int manufactureYear) {
        if (manufactureYear > 0) {
            this.manufactureYear = manufactureYear;
        }
    }
}
