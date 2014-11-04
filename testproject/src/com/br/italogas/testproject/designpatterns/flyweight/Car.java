package com.br.italogas.testproject.designpatterns.flyweight;

public class Car implements Vehicle {
	
	private String owner;
	private String name;
	private String brand;

	public Car(String owner){
		this.setOwner(owner);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car: Move() [Owner : " + owner + ", brand : " + brand + ", name : " + name + "]");

	}

	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }
}
