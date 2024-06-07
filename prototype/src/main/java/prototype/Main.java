package prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		var truck = AutoPrototype.createTruck();
		var minivan = AutoPrototype.createMinivan();
		var sedan = AutoPrototype.createSedan();
		
		truck.setColor("Blue");
		truck.setAutoNumber("36-564-26");
		
		System.out.println(truck);
		System.out.println(minivan);
		System.out.println(sedan);

	}

}
