package mediator;

public class HouseHoldService implements IService {

	private static HouseHoldService instance = new HouseHoldService();

	private HouseHoldService() {}
	
	@Override
	public void serve(String info) {
		System.out.println("HouseHold service " + info);
	}

	public static HouseHoldService getInstance() {
		return instance ;
	}
}
