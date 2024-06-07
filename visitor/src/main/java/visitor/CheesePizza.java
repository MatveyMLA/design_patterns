package visitor;

public class CheesePizza extends Pizza implements Element {
	private String cheese;

	public CheesePizza(String cheese) {
		this.cheese = cheese;
	}

	public CheesePizza(String dough, String tomatoSauce, String cheese) {
		super(dough, tomatoSauce);
		this.cheese = cheese;
	}

	public String getCheese() {
		return cheese;
	}
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCheesePizza(this);
	}
}
