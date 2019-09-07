package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.HashMap;

public class GameSound {
	public static GameSound instance;

	public static String MENU = "menu.wav";
	public static String CLICK = "click.wav";
	public static String PLAYING = "background.wav";
	public static String SHOOT = "shoot.wav";
	public static String BANG = "bang.wav";
	public static String DANCE = "dance.wav";
	public static String GAMEOVER = "gameover.wav";
	public static String SCREAM = "scream.wav";
	public static String TOUCH = "touch.wav";

	private HashMap<String, AudioClip> audioMap;

	public GameSound() {
		audioMap = new HashMap<>();
		loadAllAudio();
	}

	public static GameSound getIstance() {
		if (instance == null) {
			instance = new GameSound();
		}

		return instance;
	}

	public void loadAllAudio() {
		putAudio(MENU);
		putAudio(CLICK);
		putAudio(PLAYING);
		putAudio(SHOOT);
		putAudio(DANCE);
		putAudio(GAMEOVER);
		putAudio(BANG);
		putAudio(TOUCH);
		putAudio(SCREAM);
	}

	public void stop() {
		getAudio(MENU).stop();
		getAudio(CLICK).stop();
		getAudio(PLAYING).stop();
		getAudio(SHOOT).stop();
		getAudio(DANCE).stop();
		getAudio(GAMEOVER).stop();
		getAudio(BANG).stop();
		getAudio(TOUCH).stop();
		getAudio(SCREAM).stop();
	}


	public void putAudio(String name) {
		AudioClip auClip = Applet.newAudioClip(GameSound.class.getResource(name));
		audioMap.put(name, auClip);
	}

	public AudioClip getAudio(String name) {
		return audioMap.get(name);
	}
}
