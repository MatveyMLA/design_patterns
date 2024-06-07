package flyweight;

import java.awt.Color;

import flyweight.factory.UnitFactory;
import flyweight.flyweight.Tank;

public class Main {

	public static void main(String[] args) {
	
		var game = new Game();
		
		game.creatArmy();
		game.game();
	}

}
