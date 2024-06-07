package observer;

import observer.services.DogService;
import observer.services.FireFitherStation;
import observer.services.Hospital;
import observer.services.PoliceStation;

public class Main {

	public static void main(String[] args) {
		Storm storm = new Storm();
		var PLS = new PoliceStation();
		System.out.println(storm.addSubscribers(PLS, new FireFitherStation(), new Hospital(), new DogService()));
		
		storm.inform(StormLevel.STRONG);
		
		storm.getSubscribers().forEach(PublicService::serve);
		
		storm.remove(PLS);
		System.err.println("---------------------------------------------");
		storm.getSubscribers().forEach(PublicService::serve);
		
		
	}

}
