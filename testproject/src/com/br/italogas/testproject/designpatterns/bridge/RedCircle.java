package com.br.italogas.testproject.designpatterns.bridge;

public class RedCircle implements DrawAPI {

	public RedCircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
