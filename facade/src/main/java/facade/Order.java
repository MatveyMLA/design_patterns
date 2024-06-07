package facade;

public class Order implements IOrder {

	@Override
	public void order() {
		System.out.println("Doing Order");
	}

}
