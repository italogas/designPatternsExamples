package com.br.italogas.testproject.designpatterns.prototype;

public class ProtoypePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

	}

}
