package iterator_pattern;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorIterator extends BaseIterator {


	public AuthorIterator(List<Book> models) {
		super(models.stream()
				.sorted((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()))
				.collect(Collectors.toList()));		
	}

}
