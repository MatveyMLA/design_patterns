package flyweight.flyweight;

import java.awt.Color;

import flyweight.context.Context;

public abstract class Unit implements IUnit {

	private String name;
	private Color color;
	private Object sprite;
	
	
	
	public Unit(Color color, Object sprite, String name) {
		this.name = name;
		this.color = color;
		this.sprite = sprite;
	}

	@Override
	public void moove(Context context) {
		System.out.println(this +  " Is Mooving To: " + context.getX() + " : " + context.getY());
	}

	@Override
	public void shoot(Context context) {
		System.out.println(this +  " Is Shooting To: " + context.getX() + " : " + context.getY());
	}
	

	public Color getColor() {
		return color;
	}

	public Object getSprite() {
		return sprite;
	}

	
}
