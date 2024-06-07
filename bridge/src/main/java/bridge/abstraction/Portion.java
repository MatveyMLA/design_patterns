package bridge.abstraction;

import bridge.implementation.IKitchen;

public abstract class Portion implements IPortion {
	
	protected IKitchen kitchen;

	public Portion(IKitchen kitchen) {
		this.kitchen = kitchen;
	}
	
	
}
