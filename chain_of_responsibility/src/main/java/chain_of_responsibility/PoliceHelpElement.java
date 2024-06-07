package chain_of_responsibility;
import static org.apache.commons.lang3.ObjectUtils.notEqual;;

public class PoliceHelpElement extends BaseHelpElement {

	@Override
	public void help(HelpType helpType) {		
		if(notEqual(helpType, HelpType.POLICE)) {
			nextElement.help(helpType);		
			return;
		}
		
		System.out.println("POLICE ON THIS CASE");
	}

}
