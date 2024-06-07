package facade;

import facade.facades.StorageFacade;

public class Main {

	public static void main(String[] args) {
		var facade = new StorageFacade();
		
		facade.getItem();
		facade.utilize();
	}

}
