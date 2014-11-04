package com.br.italogas.testproject.designpatterns.abstractfactory;

import com.br.italogas.testproject.designpatterns.factory.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);

}
