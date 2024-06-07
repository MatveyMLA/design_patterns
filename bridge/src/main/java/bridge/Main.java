package bridge;

import bridge.abstraction.Desert;
import bridge.abstraction.Dish1;
import bridge.abstraction.Dish2;
import bridge.implementation.ItalianKitchen;
import bridge.implementation.JapaneseKitchen;
import bridge.implementation.UkranuanKitchen;

public class Main {

	public static void main(String[] args) {
		
		var dish1 = new Dish1(new UkranuanKitchen());
		dish1.prepare();
		dish1.serve();
		System.out.println();
		
		var dish2 = new Dish2(new ItalianKitchen());
		dish2.prepare();
		dish2.serve();
		System.out.println();
		
		var desert = new Desert(new JapaneseKitchen());
		desert.heat();
		desert.prepare();
		desert.serve();
			
	}

}
