package com.br.italogas.testproject.designpatterns.chain;

public class ChainPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is a information. ");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information. ");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is a error information. ");

	}

	private static AbstractLogger getChainOfLoggers() {
		// TODO Auto-generated method stub
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}

}
