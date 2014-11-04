package com.br.italogas.testproject.designpatterns.flyweight;

import java.util.HashMap;

public class VehicleFactory {

	private static final HashMap<String, Vehicle> vehicleMap = new HashMap<String, Vehicle>();

	public static Vehicle getCar(String owner){
		Car car = (Car) vehicleMap.get(owner);
		
		if(car == null){
			car = new Car(owner);	
			vehicleMap.put(owner, car);
			System.out.println("Creating " + owner + "'s car. ");
		}
		
		return car;
	}

}
