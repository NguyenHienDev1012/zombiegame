package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.GameManager;
import model.ImageGame;
import model.Level;

public class GamePlay extends JPanel implements Runnable, KeyListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GameManager gameManager;

	public static boolean isRunning;
	private boolean isPause = false;
	private Thread thread;
	private MyContainer mContainer;
	private JButton btn_Menu, btn_Reset;
	
	private JLabel lb_Pause;

	@Override
	public void run() {

		while (isRunning) {
			
			if (isPause == false) {
				gameManager.tick();
				repaint();
			}
	
			try {
				
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		gameManager.checkGameOver();
	}

	public GamePlay(MyContainer mContainer, int map, int level) {
		isRunning = true;
		this.mContainer = mContainer;
		gameManager = new GameManager(map, level);
		ImageGame.loadImages();
		initButton();
		thread = new Thread(this);
		thread.start();
		this.setLayout(null);
		this.addKeyListener(this);

	}

	public void initButton() {
		btn_Menu = new JButton("MENU");
		btn_Reset = new JButton("RESET");
	
		lb_Pause = new JLabel("<html>press P:<br>to PAUSE</html>");
	
		btn_Menu.setBackground(Color.WHITE);
		btn_Menu.setForeground(Color.BLUE);
		btn_Menu.setFont(new Font("", Font.BOLD, 15));
		btn_Menu.setBounds(3, 480, 90, 38);
		btn_Menu.addActionListener(this);
		this.add(btn_Menu);

		btn_Reset.setBackground(Color.WHITE);
		btn_Reset.setForeground(Color.BLUE);
		btn_Reset.setFont(new Font("", Font.BOLD, 15));
		btn_Reset.setBounds(3, 430, 90, 38);
		btn_Reset.addActionListener(this);
		this.add(btn_Reset);

		
		lb_Pause.setBackground(Color.WHITE);
		lb_Pause.setForeground(Color.RED);
		lb_Pause.setFont(new Font("", Font.BOLD, 15));
		lb_Pause.setBounds(3, 350, 90, 50);
		lb_Pause.setOpaque(true);
		this.add(lb_Pause);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		gameManager.paintGame(this, g);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			GameManager.player.setUp(true);
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			GameManager.player.setDown(true);
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			GameManager.player.setFire(true);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_P) {
			pauseGame();
		}
		

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			GameManager.player.setUp(false);
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			GameManager.player.setDown(false);
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			GameManager.player.setFire(false);
		}
	}
	
	public void pauseGame() {
		if (isPause == false) {
			isPause = true;
		} else
			isPause = false;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Menu) {
			Level.score.setScore(0);
			isRunning = false;
			mContainer.setShowMenu();
		}

		if (e.getSource() == btn_Reset) {
			Level.score.setScore(0);
			isRunning = false;
			mContainer.setShowMenu();
			mContainer.setShowPlay(gameManager.getMap(), gameManager.getLevel());
			
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
