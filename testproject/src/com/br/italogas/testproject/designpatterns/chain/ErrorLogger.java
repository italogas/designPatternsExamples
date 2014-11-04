package com.br.italogas.testproject.designpatterns.chain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error console::Logger " + message);

	}

}
