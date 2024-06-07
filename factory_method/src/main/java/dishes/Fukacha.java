package dishes;

public class Fukacha implements Dish {
	
	private final Long cookingTime = 3000L;
	
	@Override
	public void sayRady() {
		System.out.println("Fukacha is redy");	
	}
	
	@Override
	public Long getCookingTime() {
			return cookingTime;
	}

}
