package model;

public class LevelFactory {
	private Level level;
	
	public Level createLevel(String type) {
		
		if(type.equals("easy")) {
			level = new LevelEasy();
		}else if(type.equals("normal")) {
			level = new LevelNormal();
		}else if(type.equals("hard")) {
			level = new LevelHard();
		}
		
		return level;
	}
}
