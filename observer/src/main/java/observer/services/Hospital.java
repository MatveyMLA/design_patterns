package observer.services;

import lombok.Data;
import observer.PublicService;
import observer.StormLevel;

@Data
public class Hospital extends PublicService {
	

	@Override
	public void serve() {
		System.err.println("HOSPITAL");
		switch (stormLevel) {
		case  NOT_STORMING -> System.out.println("ON URS WAY IMMIDIATLY! : " +  StormLevel.NOT_STORMING);
		case  WEAK -> System.out.println("NO PROBLEM! ON URS WAY IMMIDIATLY! : " +  StormLevel.WEAK	);
		case  MIDLE -> System.out.println("LITTLE PREPERATION AND WE GO! : " +  StormLevel.MIDLE);
		case  STRONG -> System.out.println("ITS RISKY AND WILL TAKE A TIME! : " +  StormLevel.STRONG);
		case FATALITY -> System.out.println("THERE IS NO BODY HELP US :/ ! : " +  StormLevel.FATALITY);
		
		default ->	throw new IllegalArgumentException("Unexpected value: " + stormLevel);
		}
	}
}
