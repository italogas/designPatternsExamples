package com.br.italogas.testproject.designpatterns.abstractfactory;

import com.br.italogas.testproject.designpatterns.factory.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if(colorType == null){
			return null;
		}
		
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		} else if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		} else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		} else {
			return null;
		}
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
