package bridge.implementation;

public abstract class Kitchen implements IKitchen {
	
	
	public String getNationalKitchenName() {
		return this.getClass().getSimpleName();
	}
}
