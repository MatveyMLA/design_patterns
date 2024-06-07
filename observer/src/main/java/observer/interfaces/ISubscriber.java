package observer.interfaces;

import observer.StormLevel;

public interface ISubscriber {
	void inform(StormLevel stormLvl);
}
