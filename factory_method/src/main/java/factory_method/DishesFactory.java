package factory_method;

import dishes.Dish;
import dishes.Fukacha;
import dishes.Pizza;

public class DishesFactory {
	
	public static Dish createDish(String dishName) {
		return switch(dishName) {
			case "Pizza" -> new Pizza();
			case "Fukacha" -> new Fukacha();
			default -> throw new IllegalArgumentException(dishName);
		};
	}
}
