package com.br.italogas.testproject.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker class.
 * @author Ítalo
 *
 */
public class Broker {

	private List<Order> orderList = new ArrayList<Order>();
	
	void takeOrder(Order order){
		orderList.add(order);
	}
	
	void placeOrders(){
		for(Order o : orderList){
			o.execute();
		}
		orderList.clear();
	}

}
