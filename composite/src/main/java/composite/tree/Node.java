package composite.tree;

import java.util.ArrayList;
import java.util.List;

public class Node implements Element {
	
	private int counter;
	
	private List<Element> children;
	
	public Node() {
		this.children = new ArrayList<Element>();
	}
	
	@Override
	public void inc() {
		counter++;
		
		for(Element child: this.children) {
			child.inc();
		}
	}
	
	public void printCounter() {
		System.out.println(this + " : " + counter);
		
		for(Element child: this.children) {
			child.printCounter();
		}
	}

	
	public void setChildren(List<Element> elements) {
		this.children.addAll(elements);
	}
	
	public List<Element> getChildren(){
		return this.children;
	}
	
	public int getCounter() {
		return counter;
	}
}
