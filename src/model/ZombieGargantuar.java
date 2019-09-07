package model;

import java.awt.Graphics;

import view.GamePlay;

public class ZombieGargantuar extends Zombie implements Moving{

	public ZombieGargantuar(int x, int y) {
		super(x, y);
		this.blood = 7;
		this.name = "zombie gargantuar";
	}

	
	public void draw(GamePlay play, Graphics g) {
		ImageGame.imageGargantuarZombie.paintIcon(play, g, x, y);
		
	}

	
	public void update() {
		x += -1;
		
	}

}
