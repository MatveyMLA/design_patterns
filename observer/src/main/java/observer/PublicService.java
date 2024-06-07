package observer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import observer.interfaces.ISubscriber;

public abstract class PublicService implements ISubscriber {

	protected StormLevel stormLevel;

	public PublicService() {
		this.stormLevel = StormLevel.NOT_STORMING;
	}

	@Override
	public void inform(StormLevel stormLvl) {
		this.stormLevel = stormLvl;
	}

	public abstract void serve();
}
