package chain_of_responsibility;

import static org.apache.commons.lang3.ObjectUtils.notEqual;

public class AmbulaceHelpElement extends BaseHelpElement {

	@Override
	public void help(HelpType helpType) {
		if(notEqual(helpType, HelpType.AMBULANCE)) {
			nextElement.help(helpType);	
			return;
		}
		
		System.out.println("AMBULANCE ON THIS CASE");
		
	}

}
