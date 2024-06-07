package visitor;

public class MushroomsPizza extends Pizza implements Element {
	private String mushrooms;

	public MushroomsPizza(String mushrooms) {
		this.mushrooms = mushrooms;
	}

	public MushroomsPizza(String dough, String tomatoSauce, String mushrooms) {
		super(dough, tomatoSauce);
		this.mushrooms = mushrooms;
	}

	public String getMushrooms() {
		return mushrooms;
	}
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.visitMushroomsPizza(this);
	}
}
