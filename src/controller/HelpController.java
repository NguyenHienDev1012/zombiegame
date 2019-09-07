package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.ImageGame;
import view.HelpPanel;
import view.MenuView;

public class HelpController extends ControllerView{
	private HelpPanel help;
	public HelpController(MenuView view) {
		super(view);
		help = this.view.myContainer.getHelp();
		help.addHelpMouseListener(new HelpMouseListener());
	}
	private class HelpMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == help.getLbOk()) {
				
				help.getLbOk().setIcon(ImageGame.imageOk_on);
			}
		}

		public void mouseExited(MouseEvent e) {
			if (e.getSource() == help.getLbOk()) {
				
				help.getLbOk().setIcon(ImageGame.imageOk_off);
			}
		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource() == help.getLbOk()) {
				view.myContainer.setShowMenu();
			}
			
		}

	}
}
