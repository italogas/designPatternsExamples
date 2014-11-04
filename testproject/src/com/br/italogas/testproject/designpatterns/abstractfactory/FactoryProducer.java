package com.br.italogas.testproject.designpatterns.abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		} else if (choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory1();
		} else {
			return null;
		}
	}

}
