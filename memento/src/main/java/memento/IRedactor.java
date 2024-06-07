package memento;

import memento.Redactor.Memento;

public interface IRedactor {
	IMemento save();
	void restore(Memento state);
}
