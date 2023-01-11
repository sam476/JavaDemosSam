package com.cognixia.jump.classesandobjects;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("car","yellow",4);
		
		System.out.println(car);
		
		Vehicle temp = new Vehicle();
        System.out.println(temp);
        
        // temp.getVehicleCount
        System.out.println(Vehicle.getVehicleCount());
        
        System.out.println(temp.describe(1));
        System.out.println(car.describe());
	}

}
