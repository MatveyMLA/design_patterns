package observer.interfaces;

import observer.PublicService;
import observer.StormLevel;

public interface IPublisher {
	boolean remove(ISubscriber sub);

	boolean addSubscribers(PublicService... subs);
	
	void inform(StormLevel inform);
}
