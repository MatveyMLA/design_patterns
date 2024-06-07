package chain_of_responsibility;

public class LastElement extends BaseHelpElement {

	@Override
	public void help(HelpType helpType) {
		
		System.err.println("NO ONE CAN HELP YOU");
	}

}
