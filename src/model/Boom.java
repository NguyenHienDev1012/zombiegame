package model;

import java.awt.Graphics;

import view.GamePlay;

public class Boom {
	private int x;
	private int y;
	
	public Boom(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawBoom(GamePlay play, Graphics g) {
		ImageGame.imageBom.paintIcon(play, g, x, y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	
	
}
