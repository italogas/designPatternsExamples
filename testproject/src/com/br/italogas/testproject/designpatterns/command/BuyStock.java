package com.br.italogas.testproject.designpatterns.command;

public class BuyStock implements Order {
	
	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.buy();

	}

}
