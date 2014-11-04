package com.br.italogas.testproject.designpatterns.bridge;

public class Circle extends Shape {

	private int radius, x, y;

	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		getDrawAPI().drawCircle(radius, x, y);
	}

}
