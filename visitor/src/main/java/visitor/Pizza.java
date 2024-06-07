package visitor;

public abstract class Pizza implements Element {
	
	private String dough;
	private String tomatoSauce;
	
	public Pizza(String dough, String tomatoSauce) {
		this.dough = dough;
		this.tomatoSauce = tomatoSauce;
	}
	
	public Pizza() {
		this.dough = "Basic pizza dough";
		this.tomatoSauce = "Standart pizza tomato Sauce";
	}

	public String getDough() {
		return dough;
	}

	public String getTomatoSauce() {
		return tomatoSauce;
	}
}
