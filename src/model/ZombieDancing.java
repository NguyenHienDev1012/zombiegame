package model;

import java.awt.Graphics;

import view.GamePlay;

public class ZombieDancing extends Zombie implements Moving{

	public ZombieDancing(int x, int y) {
		super(x, y);
		this.blood = 3;
		this.name = "zombie dancing";
	}

	
	public void draw(GamePlay play, Graphics g) {
		ImageGame.imageDancingZombie.paintIcon(play, g, x, y);
		
	}

	
	public void update() {
		x += -1;
		
	}

}
