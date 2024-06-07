package memento;

import java.util.HashMap;
import java.util.stream.Collectors;

import memento.Redactor.Memento;

public class CareTaker implements ICareTaker {

	private HashMap<Long, Memento> history;
	
	public CareTaker() {
		this.history = new HashMap<Long, Memento>();
	}

	@Override
	public void addToHistory(Memento memento) {
		this.history.put(memento.getNumOfCopy(), memento);
	}

	@Override
	public Memento getLastState() {
		int last = history.values().size()-1;
		return history.values()
				.stream()
				.collect(Collectors.toList())
				.get(last);
	}
	
	@Override
	public IMemento get(Long mementoNum) {
		return history.get(mementoNum);
	}
}
