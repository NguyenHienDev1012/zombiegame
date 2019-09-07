package model;

import java.awt.Graphics;

import view.GamePlay;

public class ZombieFlyRegular extends Zombie implements Moving{

	public ZombieFlyRegular(int x, int y) {
		super(x, y);
		this.blood = 3;
		this.name = "zombie fly regular";
	}

	
	public void draw(GamePlay play, Graphics g) {
		ImageGame.imageFlyRegularZombie.paintIcon(play, g, x, y);
		
	}

	
	public void update() {
		x += -1;
		
	}

}
