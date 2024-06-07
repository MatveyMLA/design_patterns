package bridge.implementation;

public class JapaneseKitchen extends Kitchen {

	@Override
	public void cut() {
		System.out.println("Cutting Ingridients for " + getNationalKitchenName());
	}

	@Override
	public void boil() {
		System.out.println("Boil Ingridients for " + getNationalKitchenName());
		
	}

	@Override
	public void fry() {
		System.out.println("Frying Ingridients for " + getNationalKitchenName());
		
	}

	@Override
	public void assemble() {
		System.out.println("Assemble Ingridients for " + getNationalKitchenName());
		
	}
}
