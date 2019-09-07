package main;

import controller.ControllerMain;
import controller.ControllerView;
import view.MenuView;

public class RunGame {
	public static void main(String[] args) {
		MenuView view = new MenuView();
		ControllerMain controller = new ControllerView(view);
		controller.displayGame();
		view.getView().setVisible(true);
	}
	
	
}
