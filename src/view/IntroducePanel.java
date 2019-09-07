package view;

import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ImageGame;

public class IntroducePanel {
	protected JPanel introducePanel;
	private JLabel lbOk, lbBackground;
	
	private ImageIcon backgroundIcon;
	
	
	public IntroducePanel() {
		introducePanel = new JPanel();
		introducePanel.setLayout(null);
		initComps();
		initBackground();
	}
	


	public JLabel getLbOk() {
		return lbOk;
	}
	
	
	
	public void initComps() {	
		lbOk = setLabel(990, 500, ImageGame.imageOk_off);
		introducePanel.add(lbOk);
	
		
	}
	
	public JLabel setLabel(int x, int y, ImageIcon icon) {
		JLabel label = new JLabel();
		label.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
		label.setIcon(icon);
		return label;
	}
	
	public void initBackground() {
		lbBackground = new JLabel();
		lbBackground.setBounds(7, -20, MenuView.WIDTHJF, MenuView.HEIGHTJF);
		backgroundIcon = new ImageIcon();
		backgroundIcon = ImageGame.imageIntroduceBackground;
		lbBackground.setIcon(backgroundIcon);
		introducePanel.add(lbBackground);
	}
	
	public void addIntroduceMouseListener(MouseAdapter adapter) {
		lbOk.addMouseListener(adapter);	
	}
}
