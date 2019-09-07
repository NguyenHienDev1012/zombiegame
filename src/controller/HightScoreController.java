package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import model.ImageGame;
import model.ReadFileHightScore;
import sound.GameSound;
import view.MenuView;
import view.HightScorePanel;

public class HightScoreController extends ControllerView{
	private HightScorePanel scorePanel;
	private ReadFileHightScore model;

	public HightScoreController(ReadFileHightScore model, MenuView view) {
		super(view);
		this.model = model;
		scorePanel = this.view.myContainer.getHightScore();
		scorePanel.addHightScoreActorMouseListener(new HightScoreActionListener());
		drawScore();
	}

	private void drawScore() {
		scorePanel.setArrHightScore(model.getArrHightScore());
	}

	class HightScoreActionListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == scorePanel.getLbOk()) {
				GameSound.getIstance().getAudio(GameSound.CLICK).play();				
				scorePanel.getLbOk().setIcon(ImageGame.imageOk_on);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == scorePanel.getLbOk()) {
				GameSound.getIstance().getAudio(GameSound.CLICK).play();				
				scorePanel.getLbOk().setIcon(ImageGame.imageOk_off);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == scorePanel.getLbOk()) {
				GameSound.getIstance().getAudio(GameSound.CLICK).play();
				view.myContainer.setShowMenu();
			}

		};
	}
}
