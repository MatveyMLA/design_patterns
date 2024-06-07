package dishes;

public class Pizza implements Dish {
	
	private final Long cookingTime = 5000L;
	
	@Override
	public void sayRady() {
		System.out.println("Pizza is redy!!");
	}
	
	@Override
	public Long getCookingTime() {
		return cookingTime;
	}
}
