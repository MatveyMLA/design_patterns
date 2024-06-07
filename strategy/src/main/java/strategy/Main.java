package strategy;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		Context context = new Context(new QuickSort());
		context.sort();
		context.print();
		
	}
}
