package com.br.italogas.testproject.designpatterns.chain;

public abstract class AbstractLogger {

	
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	protected int level;
	
	//next element in the chain of responsibility
	private AbstractLogger nextLogger;

	void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}
	
	void logMessage(int level, String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}

	abstract public void write(String message);

}
