package flyweight;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import flyweight.factory.UnitFactory;
import flyweight.flyweight.APC;
import flyweight.flyweight.IUnit;
import flyweight.flyweight.Tank;

public class Army {
	public List<IUnit> army; 
	
	
	
	public Army() {
		this.army = new ArrayList<IUnit>();
	}
	
	void addUnitToArmy(Color color, Object sprite, String name, int qantity) {
		
		for(;qantity > 0; qantity --) {
			var unit = UnitFactory.getInstance().getUnit(color, sprite, name);
			this.army.add(unit);
		}
	}
	public List<IUnit> getArmy(){
		return this.army;
	}
	
	public void printArmy(){
		this.army.forEach(System.out::println);
	}
	
}
