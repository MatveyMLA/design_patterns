package observer;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import observer.interfaces.IPublisher;
import observer.interfaces.ISubscriber;

public class Storm implements IPublisher {

	private Set<PublicService> subscribers;

	public Storm() {
		this.subscribers = new HashSet<PublicService>();
		
	}

	@Override
	public boolean addSubscribers(PublicService... subs) {
		return Collections.addAll(this.subscribers,subs );
	}

	@Override
	public boolean remove(ISubscriber sub) {
		return this.subscribers.remove(sub);
	}

	public void removeAll() {
		this.subscribers.clear();
	}

	@Override
	public void inform(StormLevel stormLvl) {
		this.subscribers.forEach(sub -> sub.inform(stormLvl));
	}

	public void stopedStorming() {
		this.subscribers.forEach(sub -> sub.inform(StormLevel.NOT_STORMING));
	}

	public Set<PublicService> getSubscribers() {
		return this.subscribers;
	}
}
