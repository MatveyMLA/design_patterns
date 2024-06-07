package decorator;

import decorator.pizzas.BaconPizza;
import decorator.pizzas.DoubleCheesePizza;
import decorator.pizzas.MushroomsPizza;
import decorator.pizzas.PinapplePizza;
import decorator.pizzas.Pizza;
import decorator.pizzas.SeaFoodPizza;
import decorator.pizzas.WhitePizza;

public class Main {

	public static void main(String[] args) {
		var baconPizza = new SeaFoodPizza(new BaconPizza(new Pizza()));
		var doubleCheesePizza = new SeaFoodPizza(new DoubleCheesePizza(new Pizza()));
		var mushroomsPizza = new PinapplePizza(new DoubleCheesePizza(new MushroomsPizza(new WhitePizza())));
		
		System.out.println(baconPizza.assemble());
		System.out.println(doubleCheesePizza.assemble());
		System.out.println(mushroomsPizza.assemble());
		
	}

}
