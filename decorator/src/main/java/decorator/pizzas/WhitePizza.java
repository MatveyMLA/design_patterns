package decorator.pizzas;

import decorator.IPizza;

public class WhitePizza implements IPizza {

	@Override
	public String assemble() {
		return "Pizza with White Souce and Yello Cheese";
	}

}
