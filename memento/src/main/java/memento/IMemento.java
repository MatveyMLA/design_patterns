package memento;

import java.time.LocalDate;

public interface IMemento {
	long getNumOfCopy();
	LocalDate getDateCreated();
}
