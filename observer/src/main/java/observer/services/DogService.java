package observer.services;

import lombok.Data;
import observer.PublicService;
import observer.StormLevel;

@Data
public class DogService extends PublicService {

	@Override
	public void serve() {
		System.err.println("DogService");
		switch (stormLevel) {
		case  NOT_STORMING -> System.out.println("ON URS WAY IMMIDIATLY! : " +  StormLevel.NOT_STORMING);
		case  WEAK -> System.out.println("NO PROBLEM! ON URS WAY IMMIDIATLY! : " +  StormLevel.WEAK	);
		case  MIDLE -> System.out.println("I THINK IT WILL WAIT! : " +  StormLevel.MIDLE);
		case  STRONG -> System.out.println("ARE YOU CRAZY? IT WILL WAIT! : " +  StormLevel.STRONG);
		case FATALITY -> System.out.println("DOESNT METTER :/ ! : " +  StormLevel.FATALITY);
		
		default ->	throw new IllegalArgumentException("Unexpected value: " + stormLevel);
		}
	}

}
