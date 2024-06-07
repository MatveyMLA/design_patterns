package abstract_factory;

public class Main {

	public static void main(String[] args) {
		
		try {
			final var traditionalLunchName = args[0];
			
			var lunchFactory = AbstractTraditionalLunchFactory.getTraditionalLunchFactory(traditionalLunchName);
			
			System.out.printf("%s traditional first dish: %s \n", traditionalLunchName ,lunchFactory.getFirstDish());
			System.out.printf("%s traditional second dish: %s", traditionalLunchName ,lunchFactory.getSecondDish());
			
		} catch (Exception e) {
			System.err.println("Can't serve lunch because of: " + e.getMessage());
		}
	}

}
