package chain_of_responsibility;

public class CahinHelper {

	public static IHelpService linkHelpServices(IHelpService first, IHelpService... helpServices) {
		var head = first;
		
		for(IHelpService service : helpServices) {			
			head.setNextHelpElement(service);
			head = service;			
		}
		
		return first;
	}
}
