package iterator_pattern;

import java.util.List;

public interface Iterator {

	IterableModel next();
	IterableModel previous();
	boolean hasNext();
	boolean hasPrevious();	
}
