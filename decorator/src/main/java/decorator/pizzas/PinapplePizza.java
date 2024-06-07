package decorator.pizzas;

import decorator.BasePizzaDecorator;
import decorator.IPizza;

public class PinapplePizza extends BasePizzaDecorator {

	private String pinapplePizzaIngridient = "Pinapples";
	
	public PinapplePizza(IPizza pizza) {
		super(pizza);
	}
	
	@Override
	public String assemble() {
		var pinapplePizza = String.join(" and ", super.assemble(), pinapplePizzaIngridient);
		return pinapplePizza;
		
	}


}
