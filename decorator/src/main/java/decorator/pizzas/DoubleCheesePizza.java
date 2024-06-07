package decorator.pizzas;

import decorator.BasePizzaDecorator;
import decorator.IPizza;

public class DoubleCheesePizza extends BasePizzaDecorator {
	private String doubleCheeseIngridient = "Double Cheese"; 
	
	public DoubleCheesePizza(IPizza pizza) {
		super(pizza);
	}
	
	@Override
	public String assemble() {
		var doubleCheesePizza = String.join(" and ", super.assemble(), doubleCheeseIngridient);
		return doubleCheesePizza;
	}

}
