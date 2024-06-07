package mediator;

public class FlowerService implements IService {
	private static FlowerService instatnce = new FlowerService();
	
	private FlowerService() {
		
	}
	@Override
	public void serve(String info) {
		System.out.println("Flower service for " + info);
	}

	public static FlowerService getInstance() {
		return instatnce;
	}

}
