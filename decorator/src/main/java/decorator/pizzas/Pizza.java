package decorator.pizzas;

import decorator.IPizza;

public class Pizza implements IPizza {

	@Override
	public String assemble() {
		return "Pizza with Yellow Cheese and Tomato Sauce";
	}

}
