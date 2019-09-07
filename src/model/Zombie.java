package model;

public class Zombie{
	
	protected String name;
	protected int x;
	protected int y;
	protected int blood;
	
	public Zombie(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
		
	public String getName() {
		return name;
	}
}
