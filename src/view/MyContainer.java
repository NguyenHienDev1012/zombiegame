package view;
import java.awt.CardLayout;


import javax.swing.JPanel;

import model.GameManager;
import sound.GameSound;

public class MyContainer {
	protected JPanel myContainer;
	private static final String TAG_MENU = "tag_menu";
	private static final String TAG_PLAYGAME = "tag_playgame";
	private static final String TAG_OPTIONS = "tag_option";
	private static final String TAG_HIGHTSCORE = "tag_hightscore";
	private static final String TAG_HELP = "tag_help";
	private static final String TAG_INTRODUCE = "tag_introduce";

	private GamePlay play;
	private CardLayout mCardLayout;
	private MenuView menuView;
	private MenuGame menu;
	private Options option;
	private HelpPanel help;
	private IntroducePanel introduce;
	private HightScorePanel hightScore;
	
	public MyContainer(MenuView menuView) {
		myContainer = new JPanel();
		this.menuView = menuView;
		mCardLayout = new CardLayout();
		myContainer.setLayout(mCardLayout);
		menu = new MenuGame();
		myContainer.add(menu.menuPanel, TAG_MENU);
	
		option = new Options();
		myContainer.add(option.optionPanel, TAG_OPTIONS);
		
		hightScore = new HightScorePanel();
		myContainer.add(hightScore.hightScorePanel, TAG_HIGHTSCORE);
		
		help = new HelpPanel();
		myContainer.add(help.helpPanel, TAG_HELP);
		
		introduce = new IntroducePanel();
		myContainer.add(introduce.introducePanel, TAG_INTRODUCE);
		
	}
	public MenuGame getMenu() {
		return menu;
	}
	
	public HightScorePanel getHightScore() {
		return hightScore;
	}
	public Options getOptions() {
		return option;
	}
	public IntroducePanel getAbout() {
		return introduce;
	}
	
	public MenuView getGui() {
		return menuView;
	}
	
	public void setShowMenu() {
		mCardLayout.show(this.myContainer, TAG_MENU);
		menu.menuPanel.requestFocus();
		GameSound.getIstance().stop();
		GameSound.getIstance().getAudio(GameSound.MENU).loop();
		
	}
	
	public void setShowPlay(int map, int level) {	
		play = new GamePlay(this, map ,level);
		myContainer.add(play, TAG_PLAYGAME);
		mCardLayout.show(this.myContainer, TAG_PLAYGAME);
		GameSound.getIstance().stop();
		GameSound.instance.getAudio(GameSound.PLAYING).loop();
		GameManager.gameOver = false;
		play.requestFocus();
	}
	
	public void setShowOptions() {
		mCardLayout.show(this.myContainer, TAG_OPTIONS);	
		option.optionPanel.requestFocus();	
	}
	
	public void setShowHightScore() {
		mCardLayout.show(this.myContainer, TAG_HIGHTSCORE);
		hightScore.hightScorePanel.requestFocus();
	}
	
	public void setShowHelp() {
		mCardLayout.show(this.myContainer, TAG_HELP);
		help.helpPanel.requestFocus();
	}
	
	public void setShowIntroduce() {
		mCardLayout.show(this.myContainer, TAG_INTRODUCE);
		introduce.introducePanel.requestFocus();
	}
	public HelpPanel getHelp() {
		return help;
	}
	

}
