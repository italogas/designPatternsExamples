package com.br.italogas.testproject.designpatterns.prototype;

public class Rectangle extends Shape {
	
	public Rectangle(){
		this.type = "RECTANGLE";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside Rectangle::draw() method. ");
		
	}

}
