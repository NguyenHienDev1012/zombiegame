package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.GameManager;
import model.ImageGame;
import sound.GameSound;
import view.MenuView;
import view.Options;

public class OptionsController extends ControllerView {
	private Options option;
	 GameManager gameManager;

	public static int selectMap = 1;
	public static int selectLevel = 1;

	public OptionsController(MenuView view) {
		super(view);

		option = this.view.myContainer.getOptions();
		option.addOptionsMouseListener(new OptionsMouseListener());
	}

	
	private class OptionsMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == option.getLbOk()) {
				
				option.getLbOk().setIcon(ImageGame.imageOk_on);
			}
		}

		public void mouseExited(MouseEvent e) {
			if (e.getSource() == option.getLbOk()) {
				
				option.getLbOk().setIcon(ImageGame.imageOk_off);
			}
		}

		public void mousePressed(MouseEvent e) {
			if (e.getSource() == option.getLbMapNight()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();			
				option.getLbMapNight().setIcon(ImageGame.imageMapNight_on);			
				option.getLbMapMorning().setIcon(ImageGame.imageMapMoring_off);

				selectMap = 2;
			}

			if (e.getSource() == option.getLbMapMorning()) {
				selectMap = 1;
				GameSound.instance.getAudio(GameSound.CLICK).play();
				option.getLbMapMorning().setIcon(ImageGame.imageMapMoring_on);
				option.getLbMapNight().setIcon(ImageGame.imageMapNight_off);

				
			}
			
			if (e.getSource() == option.getLbEasy()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				option.getLbEasy().setIcon(ImageGame.imageCheck_on);			
				option.getLbNormal().setIcon(ImageGame.imageCheck_off);
				option.getLbHard().setIcon(ImageGame.imageCheck_off);
				
				selectLevel = 1;
			}
			
			if (e.getSource() == option.getLbNormal()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				
				option.getLbEasy().setIcon(ImageGame.imageCheck_off);				
				option.getLbNormal().setIcon(ImageGame.imageCheck_on);			
				option.getLbHard().setIcon(ImageGame.imageCheck_off);
				
				selectLevel = 2;
			}
			
			if (e.getSource() == option.getLbHard()) {
				GameSound.instance.getAudio(GameSound.CLICK).play();
				option.getLbEasy().setIcon(ImageGame.imageCheck_off);
				option.getLbNormal().setIcon(ImageGame.imageCheck_off);
				option.getLbHard().setIcon(ImageGame.imageCheck_on);
				
				selectLevel = 3;
			}
			
			if(e.getSource() == option.getLbOk()) {
				view.myContainer.setShowMenu();
			}
			
		}

	}
}
