package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.ImageGame;
import view.IntroducePanel;
import view.MenuView;

public class IntroduceController extends ControllerView{
	private IntroducePanel introduce;
	public IntroduceController(MenuView view) {
		super(view);
		introduce = this.view.myContainer.getAbout();
		introduce.addIntroduceMouseListener(new IntroduceMouseListener());
	}
	private class IntroduceMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == introduce.getLbOk()) {
				
				introduce.getLbOk().setIcon(ImageGame.imageOk_on);
			}
		}

		public void mouseExited(MouseEvent e) {
			if (e.getSource() == introduce.getLbOk()) {
				
				introduce.getLbOk().setIcon(ImageGame.imageOk_off);
			}
		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource() == introduce.getLbOk()) {
				view.myContainer.setShowMenu();
			}
			
		}

	}
}
