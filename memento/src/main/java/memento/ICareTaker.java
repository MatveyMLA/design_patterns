package memento;

import memento.Redactor.Memento;

public interface ICareTaker {
	IMemento getLastState();
	IMemento get(Long mementoNum);
	void addToHistory(Memento memento);
}
