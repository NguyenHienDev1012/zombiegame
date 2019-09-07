package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import sound.GameSound;
import view.GamePlay;

public class GameManager {
	public static boolean gameOver;
	private WriteFileHighScore writeFileHighScore;
	public static Player player;
	DisplayScore displayScore;
	public static ArrayList<Bullet> bullets;
	public static ArrayList<Boom> booms;
	private Level selectLevel;
	private int map;
	private int level;

	public void paintGame(GamePlay play, Graphics g) {
		paintBg(play, g, map);
		player.draw(play, g);

		for (int i = 0; i < bullets.size(); i++) {
			bullets.get(i).draw(play, g);
		}

		selectLevel.paint(play, g);

		g.setFont(new Font("Courier New", 10, 50));
		g.setColor(Color.WHITE);

		if (gameOver) {
			g.drawString(DisplayScore.getScore(), 600, 560);
			
		} else {
			g.drawString(DisplayScore.getScore(), 20, 120);
		}
		

	}
	
	public void checkGameOver() {
		if(gameOver) {
			GameSound.getIstance().stop();
			GameSound.instance.getAudio(GameSound.GAMEOVER).play();
			GameSound.instance.getAudio(GameSound.SCREAM).play();
			writeFileHighScore.saveScore();
		}
	}
	


	public int getMap() {
		return map;
	}

	public int getLevel() {
		return level;
	}

	private void paintBg(GamePlay play, Graphics g, int map) {
		if (map == 1) {
			ImageGame.imageMapMorning.paintIcon(play, g, 0, 0);
		} else if (map == 2) {
			ImageGame.imageMapNight.paintIcon(play, g, 0, 0);
		}
	}

	public GameManager(int map, int level) {
		player = new Player(270, 250);
		bullets = new ArrayList<>();
		booms = new ArrayList<>();
		booms.add(new Boom(370, 60));
		booms.add(new Boom(370, 160));
		booms.add(new Boom(370, 270));
		booms.add(new Boom(370, 380));
		booms.add(new Boom(370, 490));
		
		
		writeFileHighScore = new WriteFileHighScore();
		

		this.map = map;
		this.level = level;
		initSelectLevel();

		displayScore = new DisplayScore(Level.score);

	}

	public void initSelectLevel() {
		String type = null;
		if (level == 1) {
			type = "easy";
		} else if (level == 2) {
			type = "normal";
		} else if (level == 3) {
			type = "hard";
		}
		selectLevel = new LevelFactory().createLevel(type);
	}

	public void tick() {
		selectLevel.tick();

		for (int i = 0; i < bullets.size(); i++) {
			bullets.get(i).update();
		}

		player.update();

	}

}
