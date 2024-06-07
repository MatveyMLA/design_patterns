package iterator_pattern;

import java.time.LocalDate;
import java.util.List;

import com.google.common.collect.Lists;

public class BookCollection implements  ICollection{

	private List<Book> models;

	public BookCollection() {
		init();
	}

	@Override
	public Iterator getIterator(IteratorType type) {
		return IteratorFabricMethod(type);
	}

	
	
	private Iterator IteratorFabricMethod(IteratorType type) {
		return switch (type) {
			case AUTHOR -> new AuthorIterator(models);
			case NAME -> new NameIterator(models);
			case DATE -> new DateIterator(models);

			default -> throw new IllegalArgumentException("Unexpected value: " + type);
		};
	}
	
	private void init() {
		Book book1 = Book.builder()
				.setAuthor("Vanya")
				.setName("Vanya's stories")
				.setDate(LocalDate.of(1994, 04, 1))
				.build();

		Book book2 = Book.builder()
				.setAuthor("Oleg")
				.setName("Oleg's stories")
				.setDate(LocalDate.of(1996, 04, 1))
				.build();

		Book book3 = Book.builder()
				.setAuthor("Marusya")
				.setName("Wonder Forest")
				.setDate(LocalDate.of(1997, 04, 1))
				.build();

		Book book4 = Book.builder()
				.setAuthor("Yakub")
				.setName("Lost in Forest")
				.setDate(LocalDate.of(1996, 04, 1))
				.build();

		Book book5 = Book.builder()
				.setAuthor("Greg")
				.setName("Forest Jump")
				.setDate(LocalDate.of(1999, 04, 1))
				.build();

		Book book6 = Book.builder()
				.setAuthor("Zen")
				.setName("Zen Book")
				.setDate(LocalDate.of(2000, 04, 1))
				.build();

		Book book7 = Book.builder()
				.setAuthor("Boris")
				.setName("Boriska")
				.setDate(LocalDate.of(2001, 04, 1))
				.build();

		Book book8 = Book.builder()
				.setAuthor("Ellen Greece")
				.setName("Politics")
				.setDate(LocalDate.of(2002, 04, 1))
				.build();

		Book book9 = Book.builder()
				.setAuthor("Puk Yak")
				.setName("Aliens")
				.setDate(LocalDate.of(2003, 04, 1))
				.build();

		Book book10 = Book.builder()
				.setAuthor("Nills")
				.setName("Found in space")
				.setDate(LocalDate.of(2005, 04, 1))
				.build();

		this.models = Lists.newArrayList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
	}

}

