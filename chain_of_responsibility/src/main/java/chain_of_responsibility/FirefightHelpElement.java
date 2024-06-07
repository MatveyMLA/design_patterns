package chain_of_responsibility;

import static org.apache.commons.lang3.ObjectUtils.notEqual;

public class FirefightHelpElement extends BaseHelpElement {

	@Override
	public void help(HelpType helpType) {
		
		if(notEqual(helpType, HelpType.FIREFITERS)) {
			nextElement.help(helpType);			
			return;
		}
		
		System.out.println("FIREFITERS ON THIS CASE");
	}

}
