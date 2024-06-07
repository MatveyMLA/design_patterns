package kitchen;

import dishes.Dish;

public class Oven {
	
	private Dish dish;
		
	public Oven(Dish dish) {
		this.dish = dish;
	}

	public void cook() throws Exception {
		try {
			Thread.sleep(this.dish.getCookingTime());		
			dish.sayRady();	
		} catch (InterruptedException e) {
			throw new Exception("Oven is broken :/ !!");
		}
			
	}

}
