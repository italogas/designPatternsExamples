package com.br.italogas.testproject.designpatterns.bridge;

public class GreenCircle implements DrawAPI {

	public GreenCircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
