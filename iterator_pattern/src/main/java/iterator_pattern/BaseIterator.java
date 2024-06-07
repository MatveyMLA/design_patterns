package iterator_pattern;

import java.util.List;

public abstract class BaseIterator implements Iterator {

	protected int currentPosition;
	protected int prev;
	protected int next;

	
	protected List<Book> models;

	public BaseIterator(List<Book> models) {
		this.models = models;
	}
	

	@Override
	public IterableModel next() {
		if (!hasNext()) {
			return null;
		}
		var res = models.get(next);
		currentPosition = next;
		next = currentPosition + 1;
		prev = currentPosition - 1;
		
		return res;
	}

	@Override
	public IterableModel previous() {
		if (!hasPrevious()) {
			return null;
		}
		var res = models.get(prev);
		currentPosition = prev;
		next = currentPosition + 1;
		prev = currentPosition - 1;
		return res;
	}

	@Override
	public boolean hasNext() {
		return models.size() > next;
	}

	@Override
	public boolean hasPrevious() {
		return prev >= 0;
	}
}
