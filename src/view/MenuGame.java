package view;

import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ImageGame;

public class MenuGame {
	protected JPanel menuPanel;
	private JLabel lbBackground;
	private JLabel lbPlayGame;
	private JLabel lbHighScore;
	private JLabel lbExit;
	private JLabel lbIntroduce;
	private JLabel lbHelp;
	private JLabel lbOption;
	private ImageIcon backgroundIcon;
	
	public MenuGame() {
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		initComps();
		initBackground();
	}

	public JLabel getLbBackground() {
		return lbBackground;
	}

	public JLabel getLbPlayGame() {
		return lbPlayGame;
	}

	public JLabel getLbHighScore() {
		return lbHighScore;
	}

	public JLabel getLbExit() {
		return lbExit;
	}

	public JLabel getLbIntroduce() {
		return lbIntroduce;
	}

	public JLabel getLbHelp() {
		return lbHelp;
	}

	public JLabel getLbOption() {
		return lbOption;
	}
	
	public void initComps() {
		lbPlayGame = setLabel(577, 9, ImageGame.imagePlayGame_off);
		lbHighScore = setLabel(577, 170, ImageGame.imageHighScore_off);
		lbExit = setLabel(584, 300, ImageGame.imageExit_off);
		lbOption = setLabel(765, 498, ImageGame.imageOptions_off);
		lbHelp = setLabel(867, 530, ImageGame.imageHelp_off);
		lbIntroduce = setLabel(961, 518, ImageGame.imageIntroduce_off);
		
		menuPanel.add(lbPlayGame);
		menuPanel.add(lbHighScore);
		menuPanel.add(lbExit);
		menuPanel.add(lbOption);
		menuPanel.add(lbHelp);
		menuPanel.add(lbIntroduce);
		
	}
	public void initBackground() {
		lbBackground = new JLabel();
		lbBackground.setBounds(7, -40, MenuView.WIDTHJF, MenuView.HEIGHTJF);
		backgroundIcon = new ImageIcon();
		backgroundIcon = ImageGame.imageBackgroundMenu;
		lbBackground.setIcon(backgroundIcon);
		menuPanel.add(lbBackground);
	}
	
	public JLabel setLabel(int x, int y, ImageIcon icon) {
		JLabel label = new JLabel();
		label.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
		label.setIcon(icon);
		return label;
	}
	
	public void addMenuMouseListener(MouseAdapter adapter) {
		lbPlayGame.addMouseListener(adapter);
		lbOption.addMouseListener(adapter);
		lbHighScore.addMouseListener(adapter);
		lbExit.addMouseListener(adapter);
		lbHelp.addMouseListener(adapter);
		lbIntroduce.addMouseListener(adapter);
		
	}
}
