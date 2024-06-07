package decorator.pizzas;

import decorator.BasePizzaDecorator;
import decorator.IPizza;

public class BaconPizza extends BasePizzaDecorator {
	private final String baconIngridient = "Bacon";
	
	public BaconPizza(IPizza pizza) {
		super(pizza);
	}
	
	@Override
	public String assemble() {
		var baconPizza = String.join(" and ", super.assemble(), baconIngridient);
		
		return baconPizza;
	}
}
