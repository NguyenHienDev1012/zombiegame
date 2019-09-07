package view;

import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ImageGame;

public class Options {
	protected JPanel optionPanel;
	private JLabel lbBackground;
	private JLabel lbMapMorning;
	private JLabel lbMapNight;
	private JLabel lbOk;
	private JLabel lbEasy;
	private JLabel lbNormal;
	private JLabel lbHard;
	private ImageIcon backgroundIcon;
	
	
	public Options() {
		optionPanel = new JPanel();
		optionPanel.setLayout(null);
		initComps();
		initBackground();
	}
	
	
	public JLabel getLbBackground() {
		return lbBackground;
	}
	public JLabel getLbMapMorning() {
		return lbMapMorning;
	}
	public JLabel getLbMapNight() {
		return lbMapNight;
	}
	public JLabel getLbOk() {
		return lbOk;
	}
	public JLabel getLbEasy() {
		return lbEasy;
	}
	public JLabel getLbNormal() {
		return lbNormal;
	}
	public JLabel getLbHard() {
		return lbHard;
	}
	
	public void initComps() {
		lbMapMorning = setLabel(70, 100, ImageGame.imageMapMoring_on);
		lbMapNight = setLabel(70, 300, ImageGame.imageMapNight_off);
		lbOk = setLabel(1030, 510, ImageGame.imageOk_off);
		lbEasy = setLabel(730, 175, ImageGame.imageCheck_on);
		lbNormal = setLabel(730, 295, ImageGame.imageCheck_off);
		lbHard = setLabel(730, 440, ImageGame.imageCheck_off);
		
		optionPanel.add(lbMapMorning);
		optionPanel.add(lbMapNight);
		optionPanel.add(lbOk);
		optionPanel.add(lbEasy);
		optionPanel.add(lbNormal);
		optionPanel.add(lbHard);
		
	}
	
	public JLabel setLabel(int x, int y, ImageIcon icon) {
		JLabel label = new JLabel();
		label.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
		label.setIcon(icon);
		return label;
	}
	
	public void initBackground() {
		lbBackground = new JLabel();
		lbBackground.setBounds(7, -40, MenuView.WIDTHJF, MenuView.HEIGHTJF);
		backgroundIcon = new ImageIcon();
		backgroundIcon = ImageGame.imageBackgroundOption;
		lbBackground.setIcon(backgroundIcon);
		optionPanel.add(lbBackground);
	}
	
	public void addOptionsMouseListener(MouseAdapter adapter) {
		lbMapMorning.addMouseListener(adapter);
		lbMapNight.addMouseListener(adapter);
		lbOk.addMouseListener(adapter);
		lbEasy.addMouseListener(adapter);
		lbNormal.addMouseListener(adapter);
		lbHard.addMouseListener(adapter);
		
	}
	
}
