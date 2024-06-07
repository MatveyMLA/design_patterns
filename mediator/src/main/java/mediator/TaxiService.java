package mediator;

public class TaxiService implements IService {
	
	private static TaxiService instance = new TaxiService();
	
	private TaxiService() {
		
	}

	@Override
	public void serve(String info) {
		System.out.println("Taxi service for " + info);
	}

	public static TaxiService getInstance() {
		return  instance;
	}
	
}
