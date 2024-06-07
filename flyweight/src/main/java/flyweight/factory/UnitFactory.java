package flyweight.factory;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import flyweight.flyweight.APC;
import flyweight.flyweight.IUnit;
import flyweight.flyweight.Solder;
import flyweight.flyweight.Tank;

public class UnitFactory {

	private static UnitFactory factory = new UnitFactory();
	
	private Map<String, IUnit> cache;
	
	private UnitFactory() {
		this.cache = new HashMap<String, IUnit>();
	}

	public static UnitFactory getInstance() {
		return factory;
	}
	
	public IUnit getUnit(Color color, Object sprite, String name) {
		var result = cache.get(name);
		
		if(Objects.nonNull(result)) {
			return result;
		}
		
		return switch (name) {
		
	    case "Tank" -> {
	    	var tank = new Tank(color, sprite, name);
	    	cache.put(name, tank);
	    	yield tank;
	    }

	    case "APC" -> {
	    	var apc = new APC(color, sprite, name);
	    	cache.put(name, apc);
	    	yield apc;
	    }
	    case "Solder" -> {
	    	var solder = new Solder(color, sprite, name);
	    	cache.put(name, solder);
	    	yield solder;
	    }
	    
		default -> throw new IllegalArgumentException("Unexpected value: " + name);
	    
		};	
	}
	
}
