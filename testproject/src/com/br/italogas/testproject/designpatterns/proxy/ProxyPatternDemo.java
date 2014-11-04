package com.br.italogas.testproject.designpatterns.proxy;

public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyImage image = new ProxyImage("test_10mb.jpg");
		
		//image will be loaded from disk
		image.display();
		System.out.println("");
		//image will not be loaded fom disk
		image.display();

	}

}
