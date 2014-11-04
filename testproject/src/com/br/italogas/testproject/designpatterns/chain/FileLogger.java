package com.br.italogas.testproject.designpatterns.chain;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("File console::Logger " + message);
	}

}
