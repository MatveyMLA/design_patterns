package prototype;

import java.util.HashMap;

public class AutoPrototype implements Cloneable{
	
	static private HashMap<AutoType, AutoPrototype> prototypes;
	
	static {
		prototypes = new HashMap<AutoType, AutoPrototype>();
		prototypes.put(AutoType.TRUCK, new AutoPrototype(AutoType.TRUCK));
		prototypes.put(AutoType.MINIVAN, new AutoPrototype(AutoType.MINIVAN));
		prototypes.put(AutoType.SEDAN, new AutoPrototype(AutoType.SEDAN));
	}
	 	 
	private AutoType type;
	
	private String autoNumber;
	
	private String color;
	
	private AutoPrototype(AutoType type) {
		this.type = type;
	}
	
	public static AutoPrototype createTruck() throws CloneNotSupportedException {
		return (AutoPrototype) prototypes.get(AutoType.TRUCK).clone(); 
	}
	
	public static AutoPrototype createMinivan() throws CloneNotSupportedException {
		return (AutoPrototype) prototypes.get(AutoType.MINIVAN).clone(); 
	}
	
	public static AutoPrototype createSedan() throws CloneNotSupportedException {
		return (AutoPrototype) prototypes.get(AutoType.SEDAN).clone(); 
	}

	public String getAutoNumber() {
		return autoNumber;
	}

	public void setAutoNumber(String autoNumber) {
		this.autoNumber = autoNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AutoType getType() {
		return type;
	}	
	
	@Override
	public String toString() {
		return String.format("I Am %s %s", this.color == null ? "" : this.color, this.type);
	}
}

enum AutoType {
	 MINIVAN,
	 TRUCK,
	 SEDAN 
}