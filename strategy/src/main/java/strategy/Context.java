package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Context {

	private IStrategy sortStrategy;
	private List<Integer> list; 

	public Context(IStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
		this.list = new ArrayList<Integer>();
		Collections.addAll(this.list, 1,2,8,6,3,9,77,22,5,100);
	}

	public List<Integer> sort(List<Integer> list) {
		return sortStrategy.sort(list);
	}
	
	public List<Integer> sort() {
		return sortStrategy.sort(this.list);
	}

	public void setSortStrategy(IStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void print() {
		this.list.forEach(System.out::println);
	}

}
