package view;

import java.awt.CardLayout;
import javax.swing.JFrame;

import model.ImageGame;


public class MenuView {
	private JFrame view;
	public static final int WIDTHJF = 1111;
	public static final int HEIGHTJF = 620;
	public MyContainer myContainer;
	
	public MenuView() {
		ImageGame.loadImagesMenu();
		view = new JFrame("The zomie are coming !!!");
		view.setLayout(new CardLayout());
		view.setSize(WIDTHJF, HEIGHTJF);
		view.setLocationRelativeTo(null);
		view.setResizable(false);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myContainer = new MyContainer(this);
		view.add(myContainer.myContainer);
		view.setIconImage(ImageGame.iconImage.getImage());
	}
	
	public JFrame getView() {
		return view;
	}
}
	
