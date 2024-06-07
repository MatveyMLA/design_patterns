package chain_of_responsibility;

public interface IHelpService {
	
	void setNextHelpElement(IHelpService element);
	
	void help(HelpType helpType);

}
