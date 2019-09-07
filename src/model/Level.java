package model;

import java.awt.Graphics;
import java.util.ArrayList;

import sound.GameSound;
import view.GamePlay;

public abstract class Level {
	
	protected ArrayList<Zombie> zombies;
	public static Score score;
	private boolean bom1, bom2, bom3, bom4, bom5;
	private long currentOfBom;

	public Level() {
		zombies = new ArrayList<>();
		score = new Score();
		
	}

	public abstract void createZombie(String type);

	public void paint(GamePlay play, Graphics g) {
		for (int i = 0; i < zombies.size(); i++) {
			((Moving) zombies.get(i)).draw(play, g);
		}

		clear(play, g);
	}
	
	

	
	public void clear(GamePlay play, Graphics g) {
		for (int i = 0; i < zombies.size(); i++) {
			int ex = zombies.get(i).getX();
			int ey = zombies.get(i).getY();
			int blood = zombies.get(i).getBlood();

			if (ex < 100) {
				ImageGame.imageGameOver.paintIcon(play, g, 0, 0);
				
				GameManager.gameOver = true;
				GamePlay.isRunning = false;
				GameManager.booms.get(0).setX(-200);
				GameManager.booms.get(1).setX(-200);
				GameManager.booms.get(2).setX(-200);
				GameManager.booms.get(3).setX(-200);
				GameManager.booms.get(4).setX(-200);
				
				
				
			}
			// 1
			if (ex < GameManager.booms.get(0).getX() + 60 && ey + 60 > GameManager.booms.get(0).getY()
					&& GameManager.booms.get(0).getY() > ey) {
				GameSound.instance.getAudio(GameSound.BANG).play();
				zombies.remove(i);
				i--;
				GameManager.booms.get(0).setX(-200);

				bom1 = true;

			} else {
				GameManager.booms.get(0).drawBoom(play, g);
			}
			// 2
			if (ex < GameManager.booms.get(1).getX() + 60 && ey + 60 > GameManager.booms.get(1).getY()
					&& GameManager.booms.get(1).getY() > ey) {
				GameSound.instance.getAudio(GameSound.BANG).play();
				zombies.remove(i);
				i--;
				GameManager.booms.get(1).setX(-200);

				bom2 = true;

			} else {
				GameManager.booms.get(1).drawBoom(play, g);
			}
			// 3
			if (ex < GameManager.booms.get(2).getX() + 60 && ey + 60 > GameManager.booms.get(2).getY()
					&& GameManager.booms.get(2).getY() > ey) {
				GameSound.instance.getAudio(GameSound.BANG).play();
				zombies.remove(i);
				i--;
				GameManager.booms.get(2).setX(-200);

				bom3 = true;

			} else {
				GameManager.booms.get(2).drawBoom(play, g);
			}
			// 4
			if (ex < GameManager.booms.get(3).getX() + 60 && ey + 60 > GameManager.booms.get(3).getY()
					&& GameManager.booms.get(3).getY() > ey) {
				GameSound.instance.getAudio(GameSound.BANG).play();
				zombies.remove(i);
				i--;
				GameManager.booms.get(3).setX(-200);

				bom4 = true;

			} else {
				GameManager.booms.get(3).drawBoom(play, g);
			}
			// 5
			if (ex < GameManager.booms.get(4).getX() + 60 && ey + 60 > GameManager.booms.get(4).getY()
					&& GameManager.booms.get(4).getY() > ey) {
				GameSound.instance.getAudio(GameSound.BANG).play();
				zombies.remove(i);
				i--;

				GameManager.booms.get(4).setX(-200);
				bom5 = true;

			} else {
				GameManager.booms.get(4).drawBoom(play, g);
			}

			for (int j = 0; j < GameManager.bullets.size(); j++) {
				int bx = GameManager.bullets.get(j).getX();
				int by = GameManager.bullets.get(j).getY();

				if (bx > 1070) {
					GameManager.bullets.remove(j);
					j--;
				} else {
					if (ex < bx + 10 && ey + 51 > by && by > ey && blood > 0) {
						GameSound.instance.getAudio(GameSound.TOUCH).play();
						blood--;
						zombies.get(i).setBlood(blood);
						GameManager.bullets.remove(j);
						j--;

						if (blood <= 0) {
							if (zombies.get(i).getName().equals("zombie balloon")
									|| zombies.get(i).getName().equals("zombie dancing")
									|| zombies.get(i).getName().equals("zombie fly regular")) {
								score.setScore(score.getScore() + 1);
							} else if (zombies.get(i).getName().equals("zombie football")) {
								score.setScore(score.getScore() + 3);
							} else if (zombies.get(i).getName().equals("zombie gargantuar")) {
								score.setScore(score.getScore() + 5);
							}
							zombies.remove(i);

							i--;
						}
					}
				}
			}
		}
		if (bom1 == true) {
			ImageGame.imageBang.paintIcon(play, g, 330, 5);
		}
		if (bom2 == true) {
			ImageGame.imageBang.paintIcon(play, g, 330, 110);
		}
		if (bom3 == true) {
			ImageGame.imageBang.paintIcon(play, g, 330, 220);
		}
		if (bom4 == true) {
			ImageGame.imageBang.paintIcon(play, g, 330, 320);
		}

		if (bom5 == true) {
			ImageGame.imageBang.paintIcon(play, g, 330, 430);
		}

		long breaks = (System.nanoTime() - currentOfBom) / 1000000;
		if (breaks > 2000) {
			bom1 = false;
			bom2 = false;
			bom3 = false;
			bom4 = false;
			bom5 = false;
			currentOfBom = System.nanoTime();
		}
	}
	
	public abstract void tick();

}
