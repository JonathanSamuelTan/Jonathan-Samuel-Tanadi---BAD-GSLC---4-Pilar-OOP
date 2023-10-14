package main;
import package1.*;
import package2.*;

public class Main {

	public static void main(String[] args) {
		// buat objek
		Vehicle v1 = new Vehicle("Starcraft Marine","Superfisherman",5,100000000,2019);

		LandVehicle v2 = new LandVehicle("Honda","Supra Fit",2,15000000,2018,2,"Bensin");

		AirVehicle v3 = new AirVehicle("Boeing","737",200,1000000000,2019,4,20000);

		Car v4 = new Car("Ferrari","La Ferrari",2,2000000000,2019,4,"Bensin","Hyper Car",2);

		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Vehicle is a super class of LandVehicle, AirVehicle, and Car");
		System.out.println("It has 2 methods, startEngine() and stopEngine()");
		System.out.println("The output of startEngine() in Vehicle :");
		v1.startEngine();
		System.out.println("The output of stopEngine() in Vehicle :");
		v1.stopEngine();
		System.out.println(" ");

		System.out.println("LandVehicle is a subclass of Vehicle");
		System.out.println("It has 2 methods that inherited by Vehicle class, startEngine() and stopEngine()");
		System.out.println("The output of startEngine() in LandVehicle :");
		v2.startEngine();
		System.out.println("The output of stopEngine() in LandVehicle :");
		v2.stopEngine();
		System.out.println("It has 2 methods that only exist in LandVehicle & its child, turnOnSignalLights() and honk()");
		System.out.println("The output of turnOnSignalLights() in LandVehicle :");
		v2.turnOnSignalLights();
		System.out.println("The output of honk() in LandVehicle :");
		v2.honk();
		System.out.println(" ");

		System.out.println("AirVehicle is a subclass of Vehicle");
		System.out.println("It has 2 methods that inherited by Vehicle class, startEngine() and stopEngine()");
		System.out.println("The output of startEngine() in AirVehicle :");
		v3.startEngine();
		System.out.println("The output of stopEngine() in AirVehicle :");
		v3.stopEngine();
		System.out.println("It has 2 methods that only exist in AirVehicle & its child, takeoff() and land()");
		System.out.println("The output of takeoff() in AirVehicle :");
		v3.takeoff();
		System.out.println("The output of land() in AirVehicle :");
		v3.land();
		System.out.println(" ");

		System.out.println("Car is a subclass of LandVehicle");
		System.out.println("It has 2 methods that inherited by LandVehicle class, startEngine() and stopEngine()");
		System.out.println("The output of startEngine() in Car :");
		v4.startEngine();
		System.out.println("The output of stopEngine() in Car :");
		v4.stopEngine();
		System.out.println("It has 2 methods that inherited by LandVehicle class, turnOnSignalLights() and honk()");
		System.out.println("The output of turnOnSignalLights() in Car :");
		v4.turnOnSignalLights();
		System.out.println("The output of honk() in Car :");
		v4.honk();
		System.out.println("It has 2 methods that only exist in Car, moveReverse() and turnOnAC()");
		System.out.println("The output of moveReverse() in Car :");
		v4.moveReverse();
		System.out.println("The output of turnOnAC() in Car :");
		v4.turnOnAC();

	}

}
