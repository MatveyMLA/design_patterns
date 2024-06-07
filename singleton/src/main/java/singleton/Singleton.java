package singleton;
import java.util.TreeSet;

public class Singleton implements Comparable<Singleton>{
	private static TreeSet<Singleton> set;
	
	static {
		set = new TreeSet<Singleton>();
		while(set.size() < 10) {
			set.add(new Singleton());
		}
	}
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return set.pollFirst();
	}
	
	public static int getInstancesAmount() {
		return set.size();
	}

	@Override
	public int compareTo(Singleton o) {
		return -1;
	}
	
}
