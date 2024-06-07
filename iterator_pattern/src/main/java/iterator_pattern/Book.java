package iterator_pattern;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book implements IterableModel{
	private String name;
	private String author;
	private LocalDate date;

	public Book(String name, String author, LocalDate date) {
		this.name = name;
		this.author = author;
		this.date = date;
	}

	@Override
	public String getData() {
		return this.toString();
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String name;
		private String author;
		private LocalDate date;

		public Builder setName(String name){
			this.name = name;
			return this;
		}

		public Builder setAuthor(String author){
			this.author = author;
			return this;
		}

		public Builder setDate(LocalDate date){
			this.date = date;
			return this;
		}

		public Book build() {
			return new Book(this.name, this.author, this.date);
		}
	}

}
