package com.br.italogas.testproject.designpatterns.flyweight;

public class FlyWeigthPatternDemo {
	
	public static final String owners[] = {"John", "Bruce", "Italo"};
	
	public static final String brands[] = {"Ford", "GM", "Wolkswagen", "Renault"};
	
	public static final String names[] = {"Car1", "Car2", "Car3", "Car4"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++){
			Car car = (Car) VehicleFactory.getCar(getRandomOwner());
			car.setBrand(getRandomBrand());
			car.setName(getRandomName());
			car.move();
		}

	}

	private static String getRandomOwner() {
		// TODO Auto-generated method stub
		return owners[(int) (Math.random() * owners.length)];
	}
	
	private static String getRandomBrand() {
		// TODO Auto-generated method stub
		return brands[(int) (Math.random() * brands.length)];
	}
	
	private static String getRandomName() {
		// TODO Auto-generated method stub
		return names[(int) (Math.random() * names.length)];
	}

}
