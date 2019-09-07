package controller;

import model.ReadFileHightScore;
import view.MenuView;
import view.MyContainer;

public class ControllerView implements ControllerMain{
	protected MenuView view;
	protected ReadFileHightScore model;
	public MyContainer myContainer;
	
	public ControllerView(ReadFileHightScore model, MenuView view) {
		this.model = model;
		this.view = view;
	}

	public void setModel(ReadFileHightScore model) {
		this.model = model;
		hightScoreController();
	}
	
	public ControllerView( MenuView view) {
		this.view = view;
	}
	
	@Override
	public void displayGame() {
		view.myContainer.setShowMenu();
		menuController();
		optionsController();
		helpController();
		introduceController();
	}
	
	public void menuController() {
		new MenuController(view, this);
	}
	
	public void optionsController() {
		new OptionsController(view);
	}
	
	public void hightScoreController() {
		new HightScoreController(model, view);
	}
	
	public void helpController() {
		new HelpController(view);
	}
	
	public void introduceController() {
		new IntroduceController(view);
	}


}
