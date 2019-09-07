package model;
import java.awt.Graphics;

import view.GamePlay;

public interface Moving {
	
	public  void draw(GamePlay play,Graphics g);
	public  void update();
}
