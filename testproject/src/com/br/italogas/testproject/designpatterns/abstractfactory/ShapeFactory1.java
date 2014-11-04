package com.br.italogas.testproject.designpatterns.abstractfactory;

import com.br.italogas.testproject.designpatterns.factory.Circle;
import com.br.italogas.testproject.designpatterns.factory.Rectangle;
import com.br.italogas.testproject.designpatterns.factory.Shape;
import com.br.italogas.testproject.designpatterns.factory.Square;

public class ShapeFactory1 extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else {
			return null;
		}
	}

}
