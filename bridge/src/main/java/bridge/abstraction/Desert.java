package bridge.abstraction;

import bridge.implementation.IKitchen;

public class Desert extends Portion {

	public Desert(IKitchen kitchen) {
		super(kitchen);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Desert of " + this.kitchen.getNationalKitchenName());
		this.kitchen.cut();
		
	}

	@Override
	public void serve() {
		this.kitchen.assemble();
		System.out.println("Serving Desert of " + this.kitchen.getNationalKitchenName());
	}

	@Override
	public void heat() {
		System.out.println("Heating ingridients for Desert: ");
		this.kitchen.boil();
		this.kitchen.fry();
		
	}

}
