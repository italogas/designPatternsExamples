package com.br.italogas.testproject.designpatterns.builder;

public class BuilderPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("VegMeal: ");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNonVegMeal: ");
		nonVegMeal.showItems();
		System.out.println("Total cost: " + nonVegMeal.getCost());
		
	}

}
