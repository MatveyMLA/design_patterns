package visitor;

public class SeaFoodPizza extends Pizza implements Element {
	private String seaFood;

	public SeaFoodPizza(String seaFood) {
		this.seaFood = seaFood;
	}

	public SeaFoodPizza(String dough, String tomatoSauce, String seaFood) {
		super(dough, tomatoSauce);
		this.seaFood = seaFood;
	}

	public String getSeaFood() {
		return seaFood;
	}
	
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.visitSeaFoodPizza(this);
	}

}
