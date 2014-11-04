package com.br.italogas.testproject.designpatterns.singleton;

public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleObject instance = SingleObject.getInstance();
		
		instance.showMessage();
		
		
	}

}
