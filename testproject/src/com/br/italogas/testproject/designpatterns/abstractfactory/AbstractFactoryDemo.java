package com.br.italogas.testproject.designpatterns.abstractfactory;

import com.br.italogas.testproject.designpatterns.factory.Shape;

public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

	}

}
