package com.br.italogas.testproject.designpatterns.command;

public class CommandPatternDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//request
		Stock abcStock = new Stock();
		
		//command
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		//invoker
		Broker broker = new Broker();
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(buyStockOrder);
		
		broker.placeOrders();
	}

}
