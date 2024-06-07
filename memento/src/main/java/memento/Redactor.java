package memento;

import java.time.LocalDate;

public class Redactor implements IRedactor {
	
	private String text;
	
	public Redactor(String text) {		
		this.text = String.join("", new String(), text);
	}

	public String addToText(String txt) {
		this.text = String.join(" ", this.text, txt);
		return this.text;
	}
	
	public String removeFromText(String txt) {
		this.text.replace(txt, "");
		return this.text;
	}
	
	public String removeLastWord() {
		this.text = this.text.substring(0,this.text.lastIndexOf(" "));
		return this.text;
	}
	@Override
	public Memento save() {
		return new Memento(this.text);
	}

	@Override
	public void restore(Memento state) {
		this.text = state.text;
	}
	
	public String getText(){
		return this.text;
	}
	
	class Memento implements IMemento {

		private static long counter = 0;
		
		private String text;
		private long numOfCopy;
		private LocalDate dateCreated;

		private Memento(String text) {
			counter ++;
			this.numOfCopy = counter;
			this.dateCreated = LocalDate.now();
			this.text = text;
		}
		
		@Override
		public long getNumOfCopy() {
			return numOfCopy;
		}

		@Override
		public LocalDate getDateCreated() {
			return this.dateCreated;
		}		
	}

}
