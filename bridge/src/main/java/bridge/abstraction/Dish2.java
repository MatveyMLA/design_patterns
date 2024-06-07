package bridge.abstraction;

import bridge.implementation.IKitchen;

public class Dish2 extends Portion {
	
	public Dish2(IKitchen kitchen) {
		super(kitchen);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Dish2 of " + this.kitchen.getNationalKitchenName());
		this.kitchen.cut();
		
	}

	@Override
	public void serve() {
		this.kitchen.assemble();
		System.out.println("Serving Dish2 of " + this.kitchen.getNationalKitchenName());
	}

	@Override
	public void heat() {
		System.out.println("Heating ingridients for Dish2");
		this.kitchen.boil();
		this.kitchen.fry();
		
	}


}
