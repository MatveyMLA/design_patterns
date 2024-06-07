package decorator.pizzas;

import decorator.BasePizzaDecorator;
import decorator.IPizza;

public class SeaFoodPizza extends BasePizzaDecorator {

	private String seaFoodIngridient = "Sea foods";
	
	public SeaFoodPizza(IPizza pizza) {
		super(pizza);
	}
	
	@Override
	public String assemble() {
		var seaFoodsPizza = String.join(" and ", super.assemble(), seaFoodIngridient);
		return seaFoodsPizza;
	}
	
	

}
