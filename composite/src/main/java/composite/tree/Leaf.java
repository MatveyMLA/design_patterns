package composite.tree;

public class Leaf implements Element {

	private int counter;
	
	@Override
	public void inc() {
		counter++;
	}
	
	public void printCounter() {
		System.out.println(this + " : " + counter);
	}
	
	public int getCounter() {
		return counter;
	}
}
