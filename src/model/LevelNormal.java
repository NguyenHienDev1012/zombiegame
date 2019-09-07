package model;

import java.util.Random;

public class LevelNormal extends Level {
	long current;


	public void tick() {
		String type = null;
		long breaks = (System.nanoTime() - current) / 1000000;
		if (breaks > 2000) {
			
			Random random = new Random();
			int randY = random.nextInt(4);
			switch (randY) {
			case 0:
				type = "zombie dancing";
				break;

			case 1:
				type = "zombie balloon";
				break;
			
			case 2:
				type = "zombie fly ragular";
				break;
		
			case 3:
				type = "zombie football";
				break;
		}

			createZombie(type);
			current = System.nanoTime();
			
		}

	for(

	int i = 0;i<zombies.size();i++)
	{
		((Moving) zombies.get(i)).update();
	}
	}

	@Override
	public void createZombie(String type) {
		Zombie zombie = new ZombieFactory().createZombie(type);
		zombies.add(zombie);

	}

}
