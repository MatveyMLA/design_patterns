package builder;

public class Pizza {

	private Bacon bacon;
	private Cheese cheese;
	private Mushroom mushroom;
	private Seafood seafood;
	private Pinapple pinapple;
	
	public static Builder builder() {
		return new Builder();
	}
	
	public Bacon getBacon() {
		return bacon;
	}
	public void setBacon(Bacon bacon) {
		this.bacon = bacon;
	}
	public Cheese getCheese() {
		return cheese;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Mushroom getMushroom() {
		return mushroom;
	}
	public void setMushroom(Mushroom mushroom) {
		this.mushroom = mushroom;
	}
	public Seafood getSeafood() {
		return seafood;
	}
	public void setSeafood(Seafood seafood) {
		this.seafood = seafood;
	}
	public Pinapple getPinapple() {
		return pinapple;
	}
	public void setPinapple(Pinapple pinapple) {
		this.pinapple = pinapple;
	}

	@Override
	public String toString() {
		return "Pizza with " + bacon + ", " + cheese + ", " + mushroom + ", " + seafood
				+ ", " + pinapple;
	}
	
	
}


class Builder{
	
	private Pizza pizza;
	
	
	public Builder() {
		this.pizza = new Pizza();
		this.pizza.setCheese(new Cheese());
	}
	
	public Builder addMushroom() {
		this.pizza.setMushroom(new Mushroom());
		return this;
	}
	
	public Builder addBacon() {
		this.pizza.setBacon(new Bacon());
		return this;
	}
	
	public Builder addPinapple() {
		this.pizza.setPinapple(new Pinapple());
		return this;
	}
	
	public Builder addSeafood() {
		this.pizza.setSeafood(new Seafood());
		return this;
	}
	
	public Pizza build() {
		return this.pizza;
	}
}














