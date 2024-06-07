package chain_of_responsibility;

public abstract class BaseHelpElement implements IHelpService {

	protected IHelpService nextElement;

	@Override
	public void setNextHelpElement(IHelpService element) {
		this.nextElement = element;
	}
}
