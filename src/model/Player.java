package model;

import java.awt.Graphics;

import sound.GameSound;
import view.GamePlay;

public class Player {
	private int x;
	private int y;
	private int blood;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		blood = 1;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	private boolean up = false;
	private boolean down = false;
	private boolean fire = false;

	private long currentOfMovePlayer;
	private long currentOfMoveFire;

	public void setUp(boolean up) {
		this.up = up;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public void draw(GamePlay play, Graphics g) {
		ImageGame.imagePlayer.paintIcon(play, g, x, y);
	}

	public void update() {
		if (GamePlay.isRunning) {
			if (System.currentTimeMillis() - currentOfMovePlayer > 100) {
				if (up) {
					if (y > 125) {
						y -= 110;
					}
				}
				if (down) {
					if (y < 470) {
						y += 110;
					}
				}
				currentOfMovePlayer = System.currentTimeMillis();
			}
			if (fire) {
				if (System.currentTimeMillis() - currentOfMoveFire > 110) {
					GameSound.instance.getAudio(GameSound.SHOOT).play();
					GameManager.bullets.add(new Bullet(340, y + 20));
				}
				currentOfMoveFire = System.currentTimeMillis();
			}

		}
	}
}
