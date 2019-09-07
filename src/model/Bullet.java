package model;

import java.awt.Graphics;

import view.GamePlay;

public class Bullet implements Moving{
	private int x;
	private int y;
	static float HANG = 5;
	public Bullet(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
	@Override
	public void draw(GamePlay play, Graphics g) {
		
		ImageGame.imageBullet.paintIcon(play, g, x, y);
		
	}
	@Override
	public void update() {
		x += HANG; 
		
		
	}

}
