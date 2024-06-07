package decorator.pizzas;

import decorator.BasePizzaDecorator;
import decorator.IPizza;

public class MushroomsPizza extends BasePizzaDecorator {

	private String mushroomsIngridient = "Mushrooms"; 
	
	public MushroomsPizza(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String assemble() {
		var mushroomsPizza = String.join(" and ", super.assemble(), mushroomsIngridient);
		return mushroomsPizza ;
	}
}
