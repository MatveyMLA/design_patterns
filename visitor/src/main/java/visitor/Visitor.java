package visitor;

public interface Visitor {

	String visitMushroomsPizza(MushroomsPizza element);

	String visitCheesePizza(CheesePizza element);

	String visitSeaFoodPizza(SeaFoodPizza element);

	String visitBaconPizza(BaconPizza element);

	String visitPineapplePizza(PineapplePizza element);
}
