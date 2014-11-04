package com.br.italogas.testproject.designpatterns.bridge;

public abstract class Shape {

	private DrawAPI drawAPI;

	public Shape(DrawAPI drawAPI) {
		// TODO Auto-generated constructor stub
		this.setDrawAPI(drawAPI);
	}
	
	public abstract void draw();

	public DrawAPI getDrawAPI() {
		return drawAPI;
	}
	public void setDrawAPI(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

}
