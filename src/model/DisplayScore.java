package model;

import java.util.Observable;
import java.util.Observer;


public class DisplayScore  implements Observer{
	Observable observable;
	private static String score = "0";
	public DisplayScore(Observable observable) {
		
		this.observable = observable;
		observable.addObserver(this);
	
}
	public static String getScore() {
		return score;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Score){
			Score controlScore=(Score)o;
			DisplayScore.score = String.valueOf(controlScore.getScore());
		}
	}
	
	

}
