package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.HightScore;
import model.ImageGame;

public class HightScorePanel {
	protected JPanel hightScorePanel;
	private ArrayList<HightScore> arrHightScore;
	private JLabel lbOk;
	private ImageIcon backgrLbOp;

	public HightScorePanel() {
		hightScorePanel = pnHighScore;
		hightScorePanel.setBackground(Color.YELLOW);
		hightScorePanel.setLayout(null);
		initCompts();
	}

	public void initCompts() {
		lbOk = new JLabel();
		backgrLbOp = new ImageIcon();
		backgrLbOp =  ImageGame.imageOk_off;
		lbOk.setBounds(1000, 490, backgrLbOp.getIconWidth(), backgrLbOp.getIconHeight());
		lbOk.setIcon(backgrLbOp);
		hightScorePanel.add(lbOk);
	}

	@SuppressWarnings("serial")
	private JPanel pnHighScore = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			drawImage(g2d);
			if (arrHightScore != null) {
				drawHightSore(g2d);
			}
		}
	};

	public void drawImage(Graphics2D g2d) {
		Image backgrLb = new ImageIcon().getImage();
		backgrLb = ImageGame.imageHighScoreBackground.getImage();
		g2d.drawImage(backgrLb, 0, 0, null);
	}

	public void drawHightSore(Graphics2D g2d) {
		g2d.setStroke(new java.awt.BasicStroke(2));
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setFont(new Font("Arial", Font.BOLD, 30));
		g2d.setColor(Color.YELLOW);
		int y = 170;
		for (int i = 0; i < arrHightScore.size(); i++) {
			g2d.drawString("" + (i + 1), 195, y);
			g2d.drawString("" + arrHightScore.get(i).getName(), 330, y);
			g2d.drawString("" + arrHightScore.get(i).getScore(), 665, y);
			y = y + 45;
		}

	}

	public void setArrHightScore(ArrayList<HightScore> arrHightScore) {
		this.arrHightScore = arrHightScore;
	}

	public JLabel getLbOk() {
		return lbOk;
	}

	public void addHightScoreActorMouseListener(MouseAdapter adapter) {
		lbOk.addMouseListener(adapter);
	}

}
