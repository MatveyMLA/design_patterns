package builder;

public class Main {

	public static void main(String[] args) {
		var pizza = Pizza.builder()
				.addBacon()
				.addMushroom()
				.build();
		
		System.out.println(pizza);

	}

}
