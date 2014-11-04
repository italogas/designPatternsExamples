package com.br.italogas.testproject.designpatterns.prototype;

public class Square extends Shape {
	
	public Square() {
		this.type = "SQUARE";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside Square::draw() method. ");

	}

}
