package com.br.italogas.testproject.designpatterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.decoratedShape.draw();
		setRedBorder(this.decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Border Color: Red");
	}

}
