package visitor;

public class PizzaVisitor implements Visitor {

	@Override
	public String visitPineapplePizza(PineapplePizza element) {
		return getPizza(element.getDough(), element.getTomatoSauce(), element.getPineapples());
	}

	@Override
	public String visitMushroomsPizza(MushroomsPizza element) {
		return getPizza(element.getDough(), element.getTomatoSauce(), element.getMushrooms());
	}

	@Override
	public String visitCheesePizza(CheesePizza element) {
		return getPizza(element.getDough(), element.getTomatoSauce(), element.getCheese());
	}

	@Override
	public String visitSeaFoodPizza(SeaFoodPizza element) {
		return getPizza(element.getDough(), element.getTomatoSauce(), element.getSeaFood());
	}

	@Override
	public String visitBaconPizza(BaconPizza element) {
		return getPizza(element.getDough(), element.getTomatoSauce(), element.getBacon());
	}

	private String getPizza(String dough, String tomatoSauce, String spetialIngrident) {
		return String.format("Pizza with %s and %s and %s. Enjoy!!!", dough, tomatoSauce, spetialIngrident);
	}
}
