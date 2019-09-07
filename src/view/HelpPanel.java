package view;

import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ImageGame;

public class HelpPanel {
	protected JPanel helpPanel;
	private JLabel lbOk, lbBackground;
	
	private ImageIcon backgroundIcon;
	
	
	public HelpPanel() {
		helpPanel = new JPanel();
		helpPanel.setLayout(null);
		initComps();
		initBackground();
	}
	


	public JLabel getLbOk() {
		return lbOk;
	}
	
	
	
	public void initComps() {	
		lbOk = setLabel(825, 485, ImageGame.imageOk_off);
		helpPanel.add(lbOk);
	
		
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
		backgroundIcon = ImageGame.imageHelpBackground;
		lbBackground.setIcon(backgroundIcon);
		helpPanel.add(lbBackground);
	}
	
	public void addHelpMouseListener(MouseAdapter adapter) {
		lbOk.addMouseListener(adapter);	
	}
}
