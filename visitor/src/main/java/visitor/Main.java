package visitor;

public class Main {

	public static void main(String[] args) {
		var bp = new BaconPizza("Italian doudh" ,"British Bacon", "Italian tomatos souce");
		var cp = new CheesePizza("Swiss Cheese");
		
		System.out.println(bp.accept(new PizzaVisitor()));		
		System.out.println(cp.accept(new PizzaVisitor()));		
	}

}
