package main;

import factory_method.DishesFactory;
import kitchen.Oven;

public class Main {

	public static void main(String[] args) {
		
		try {
			var dish = DishesFactory.createDish(args[0]);
			var oven = new Oven(dish);
			oven.cook();
			
		} catch (Exception e) {
			System.err.println("Cant cook the dish because of " + e.getMessage());
		}
	}

}
