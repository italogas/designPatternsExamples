package com.br.italogas.testproject.designpatterns.prototype;

public class Circle extends Shape {
	
	public Circle() {
		this.type = "CIRCLE";
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside Circle::draw() method. ");

	}

}
