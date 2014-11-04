package com.br.italogas.testproject.designpatterns.factory;

public class ShapeFactory {
	
	/**
	 * use this method to get object of type Shape
	 * @param shapeType
	 * @return Shape object
	 */
	public Shape getShape(String shapeType){
		
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
