package bridge.abstraction;

import bridge.implementation.IKitchen;

public class Dish3 extends Portion {
	
	public Dish3(IKitchen kitchen) {
		super(kitchen);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Dish3 of " + this.kitchen.getNationalKitchenName());
		this.kitchen.cut();
		
	}

	@Override
	public void serve() {
		this.kitchen.assemble();
		System.out.println("Serving Dish3 of " + this.kitchen.getNationalKitchenName());
	}

	@Override
	public void heat() {
		System.out.println("Heating ingridients for Dish3");
		this.kitchen.boil();
		this.kitchen.fry();
		
	}


}
