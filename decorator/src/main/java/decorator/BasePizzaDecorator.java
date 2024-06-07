package decorator;

public class BasePizzaDecorator implements IPizza {

	IPizza pizza;
	
	public BasePizzaDecorator(IPizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String assemble() {
		return pizza.assemble();
	}

}
