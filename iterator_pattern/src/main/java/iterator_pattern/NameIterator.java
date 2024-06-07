package iterator_pattern;

import java.util.List;
import java.util.stream.Collectors;


public class NameIterator extends BaseIterator {

	public NameIterator(List<Book> models) {
		super(models.stream()
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList()));		
	}
}
