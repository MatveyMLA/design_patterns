package chain_of_responsibility;

public class Handler {
	
	public static void handle(HelpType helpType){
		
		var helper = CahinHelper.linkHelpServices(new AmbulaceHelpElement(),
				new PoliceHelpElement(),
				new FirefightHelpElement(), 
				new LastElement());
		
		helper.help(helpType);
	}
}
