package iterator_pattern;

public class Main {

	public static void main(String[] args) {
		
		BookCollection collection = new BookCollection();
		
		Iterator authorIter = collection.getIterator(IteratorType.DATE);
		while (authorIter.hasNext()) {
			System.out.println(authorIter.next().getData());	
		}
		System.err.println(authorIter.previous().getData());
		System.err.println(authorIter.next().getData());
		
		System.err.println("-------------------------------");
		while (authorIter.hasPrevious()) {
			System.out.println(authorIter.previous().getData());
			
		}
		System.err.println(authorIter.next().getData());
		System.err.println(authorIter.previous().getData());
		
		
		
		
	}

}
