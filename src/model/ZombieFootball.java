package model;



import java.awt.Graphics;

import view.GamePlay;

public class ZombieFootball extends Zombie implements Moving{

	public ZombieFootball(int x, int y) {
		super(x, y);
		this.blood = 5;
		this.name = "zombie football";
		
	}
	public void draw(GamePlay play, Graphics g) {
		ImageGame.imageFootballZombie.paintIcon(play, g, x, y);
	}
	
	public void update() {
		x += -1;
	}

}
