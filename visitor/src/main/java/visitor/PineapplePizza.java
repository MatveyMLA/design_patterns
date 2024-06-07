package visitor;

public class PineapplePizza extends Pizza {
	
	private String pineapples;
	
	public PineapplePizza(String pineapples) {
		this.pineapples = pineapples;
	}

	public PineapplePizza(String dough, String tomatoSauce, String pineapples) {
		super(dough, tomatoSauce);
		this.pineapples = pineapples;
	}

	public String getPineapples() {
		return pineapples;
	}
	@Override
	public String accept(Visitor visitor) {
		return visitor.visitPineapplePizza(this);
	}
	
}
