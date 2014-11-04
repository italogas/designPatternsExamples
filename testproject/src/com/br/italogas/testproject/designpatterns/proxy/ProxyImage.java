package com.br.italogas.testproject.designpatterns.proxy;

/**
 * This class implements the Proxy design pattern. It contains an object 
 * whose functionalities are interfaced to an outside client.   
 * @author Ítalo
 *
 */
public class ProxyImage implements Image {

	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
