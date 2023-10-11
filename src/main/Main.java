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

		System.out.println("Class vehicle memiliki method: start() yang berfungsi untuk menyalakan mesin. berikut adalah outputnya: ");
		v1.start();
		System.out.println("");

		System.out.println("method ini kemudian diturunkan kepada child class dari vehicle (LandVehicle dan AirVehicle)");
		System.out.println("Setiap child class memiliki implementasi yang berbeda-beda terhadap method start() (polymorph)");
		System.out.println("");

		System.out.println("LandVehicle akan menghasilkan output:");
		v2.start();
		System.out.println("AirVehicle akan menghasilkan output:");
		v3.start();

		System.out.println("");
		System.out.println("Class car juga memiliki method start() karena secara tidak langsung, class car juga merupakan child class dari vehicle (melalui LandVehicle)");
		System.out.println("Namun, method start() pada class car memiliki implementasi yang berbeda dari method start() pada class LandVehicle");
		System.out.println("");
		
		System.out.println("Class car memiliki method start() yang menghasilkan output:");
		v4.start();

	}

}
