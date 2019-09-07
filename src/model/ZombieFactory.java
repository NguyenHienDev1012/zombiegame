package model;

import java.util.Random;

public class ZombieFactory {
	private Zombie zombie;
	private int x = 1200;
	private int y;
	
	public Zombie createZombie(String type) {
		Random random = new Random();
		int randY = random.nextInt(5);
		
		switch (randY) {
		case 0:
			y = 10;
			break;

		case 1:
			y = 110;
			break;

		case 2:
			y = 220;
			break;

		case 3:
			y = 330;
			break;
		case 4:
			y = 440;
			break;

		}
		
		if(type.equals("zombie dancing")) {
			zombie = new ZombieDancing(x, y);
		}else if(type.equals("zombie balloon")) {
			zombie = new ZombieBalloon(x, y);
		}else if(type.equals("zombie fly ragular")) {
			zombie = new ZombieFlyRegular(x, y);
		}else if(type.equals("zombie football")) {
			zombie = new ZombieFootball(x, y);
		}else if(type.equals("zombie gargantuar")) {
			zombie = new ZombieGargantuar(x, y);
		}
		
		return zombie;
	}
}
