package model;

import java.awt.Graphics;

import view.GamePlay;

public class ZombieBalloon extends Zombie implements Moving{

	public ZombieBalloon(int x, int y) {
		super(x, y);
		this.blood = 3;
		this.name = "zombie balloon";
	}

	
	public void draw(GamePlay play, Graphics g) {
		ImageGame.imageBalloonZombie.paintIcon(play, g, x, y);
		
	}

	
	public void update() {
		x += -1;
		
	}

}
