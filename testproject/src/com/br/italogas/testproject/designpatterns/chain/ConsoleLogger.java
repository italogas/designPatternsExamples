package com.br.italogas.testproject.designpatterns.chain;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Standart console::Logger " + message);
	}

}
