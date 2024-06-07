package iterator_pattern;

import java.util.List;
import java.util.stream.Collectors;

public class DateIterator extends BaseIterator {

	public DateIterator(List<Book> models) {
		super(models.stream()
				.sorted((o1, o2) -> o1.getDate().compareTo(o2.getDate()))
				.collect(Collectors.toList()));		
	}
}
