package com.br.italogas.testproject.designpatterns.facade;

/**
 * Facade class with simplified methods required by the client.
 * @author Ítalo
 *
 */
public class ShapeMaker {
	
	private Shape circle;
	private Shape square;
	private Shape rectangle;

	public ShapeMaker(){
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	void drawCircle() { circle.draw(); }
	
	void drawSquare() { square.draw(); }
	
	void drawRectangle() { rectangle.draw(); }

}
