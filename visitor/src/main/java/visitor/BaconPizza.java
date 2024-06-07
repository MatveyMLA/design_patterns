package visitor;

public class BaconPizza extends Pizza implements Element {
	private String bacon;

	public BaconPizza(String bacon) {
		this.bacon = bacon;
	}

	public BaconPizza(String dough, String tomatoSauce, String bacon) {
		super(dough, tomatoSauce);
		this.bacon = bacon;
	}

	public String getBacon() {
		return bacon;
	}
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.visitBaconPizza(this);
	}
}
