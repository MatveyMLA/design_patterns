package flyweight;

import java.awt.Color;

import flyweight.context.Context;
import flyweight.flyweight.APC;
import flyweight.flyweight.Solder;
import flyweight.flyweight.Tank;

public class Game {
	private Army army;
	
	public void creatArmy(){
		army = new Army();
		
		army.addUnitToArmy(Color.BLACK, new Object(), "Tank", 30);		
		army.addUnitToArmy(Color.BLUE, new Object(), "APC", 30);
		army.addUnitToArmy(Color.BLUE, new Object(), "Solder", 30);
		
	}
	
	public void game() {
		this.army.getArmy().forEach(unit->unit.moove(new Context(10, 20)));
		this.army.getArmy().forEach(unit->unit.shoot(new Context(10, 20)));
	}
}
