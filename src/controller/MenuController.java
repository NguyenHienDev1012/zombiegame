package controller;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.ImageGame;
import model.ReadFileHightScore;
import sound.GameSound;
import view.MenuGame;
import view.MenuView;

public class MenuController extends ControllerView{
	private MenuGame menu;
	private ControllerView controllerView;
	
	
	public MenuController(MenuView view,  ControllerView controllerView) {
		super(view);
		this.controllerView = controllerView;
		menu = this.view.myContainer.getMenu();
		menu.addMenuMouseListener(new MenuMouseListener());
	}
	
	class MenuMouseListener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == menu.getLbPlayGame()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbPlayGame().setIcon(ImageGame.imagePlayGame_on);
			}
			
			if(e.getSource() == menu.getLbHighScore()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbHighScore().setIcon(ImageGame.imageHighScore_on);
			}
			
			if(e.getSource() == menu.getLbExit()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbExit().setIcon(ImageGame.imageExit_on);
			}
			
			if(e.getSource() == menu.getLbOption()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbOption().setIcon(ImageGame.imageOptions_on);
			}
			
			if(e.getSource() == menu.getLbHelp()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbHelp().setIcon(ImageGame.imageHelp_on);
			}
			
			if(e.getSource() == menu.getLbIntroduce()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbIntroduce().setIcon(ImageGame.imageIntroduce_on);
			}
		}
		
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == menu.getLbPlayGame()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbPlayGame().setIcon(ImageGame.imagePlayGame_off);
			}
			
			if(e.getSource() == menu.getLbHighScore()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbHighScore().setIcon(ImageGame.imageHighScore_off);
			}
			
			if(e.getSource() == menu.getLbExit()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbExit().setIcon(ImageGame.imageExit_off);
			}
			
			if(e.getSource() == menu.getLbOption()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbOption().setIcon(ImageGame.imageOptions_off);
			}
			
			if(e.getSource() == menu.getLbHelp()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbHelp().setIcon(ImageGame.imageHelp_off);
			}
			
			if(e.getSource() == menu.getLbIntroduce()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				menu.getLbIntroduce().setIcon(ImageGame.imageIntroduce_off);
			}
		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource() == menu.getLbExit()) {
				System.exit(0);
			}
			
			if(e.getSource() == menu.getLbPlayGame()) {
				view.myContainer.setShowPlay(OptionsController.selectMap,OptionsController.selectLevel);
			}

			if(e.getSource() == menu.getLbOption()) {
				view.myContainer.setShowOptions();
			}
			
			if(e.getSource() == menu.getLbHighScore()) {
				controllerView.setModel(new ReadFileHightScore());
				view.myContainer.setShowHightScore();
			}
			if(e.getSource() == menu.getLbHelp()) {
				view.myContainer.setShowHelp();
			}
			
			if(e.getSource() == menu.getLbIntroduce()) {
				view.myContainer.setShowIntroduce();
			}
		}
		
	}

}
