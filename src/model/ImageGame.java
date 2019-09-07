package model;
import javax.swing.ImageIcon;

public class ImageGame {
// images in game
	public static ImageIcon imagePlayer;
	public  static ImageIcon imageDancingZombie;	
	public static ImageIcon imageBalloonZombie;
	public static ImageIcon imageBom;
	public static ImageIcon imageFootballZombie;
	public static ImageIcon imageFlyRegularZombie;
	public static ImageIcon imageGargantuarZombie;
	public static ImageIcon imageMapMorning;
	public static ImageIcon imageMapNight;
	public static ImageIcon imageBang;
	public static ImageIcon imageGameOver;
	public static ImageIcon imageBullet;
	
// images menu
	public static ImageIcon imageBackgroundMenu;
	
	public static ImageIcon iconImage;
	
	public static ImageIcon imagePlayGame_on;
	public static ImageIcon imagePlayGame_off;
	
	public static ImageIcon imageHighScore_on;
	public static ImageIcon imageHighScore_off;
	
	public static ImageIcon imageExit_on;
	public static ImageIcon imageExit_off;
	
	public static ImageIcon imageOptions_on;
	public static ImageIcon imageOptions_off;
	
	public static ImageIcon imageIntroduce_on;
	public static ImageIcon imageIntroduce_off;
	
	public static ImageIcon imageHelp_on;
	public static ImageIcon imageHelp_off;
	
// images menu options
	
	public static ImageIcon imageCheck_on;
	public static ImageIcon imageCheck_off;
	
	public static ImageIcon imageMapMoring_on;
	public static ImageIcon imageMapMoring_off;
	
	public static ImageIcon imageMapNight_on;
	public static ImageIcon imageMapNight_off;
	
	public static ImageIcon imageOk_on;
	public static ImageIcon imageOk_off;
	
	public static ImageIcon imageBackgroundOption;
	
// image Hight Socre
	public static ImageIcon imageHighScoreBackground;

// image Introduce
	public static ImageIcon imageIntroduceBackground;
// image Help
	public static ImageIcon imageHelpBackground;
	
	public static void loadImages() {		
				imagePlayer = new ImageIcon("images/images_inGame/player.gif");
				imageDancingZombie = new ImageIcon("images/images_inGame/zombie_dancing.gif");
				imageBalloonZombie = new ImageIcon("images/images_inGame/zombie_balloon.gif");
				imageFlyRegularZombie = new ImageIcon("images/images_inGame/zombie_flyRegular.gif");
				imageFootballZombie =  new ImageIcon("images/images_inGame/zombie_football.gif");
				imageGargantuarZombie =  new ImageIcon("images/images_inGame/zombie_gargantuar.gif");
				imageBom = new ImageIcon("images/images_inGame/bom.gif");
				imageBang = new ImageIcon("images/images_inGame/bang.png");
				imageBullet = new ImageIcon("images/images_inGame/bullet.png");
				imageMapMorning =  new ImageIcon("images/images_inGame/background_Morning.png");
				imageMapNight = new ImageIcon(("images/images_inGame/background_Night.png"));
				imageGameOver = new ImageIcon(("images/images_inGame/gameover.jpg"));
					
	}
	
	public static void loadImagesMenu() {

		imagePlayGame_on = new ImageIcon("images/images_menu/menu_playgame_on.png");
		imagePlayGame_off = new ImageIcon("images/images_menu/menu_playgame_off.png");
		
		imageHighScore_on = new ImageIcon("images/images_menu/menu_highscore_on.png");
		imageHighScore_off = new ImageIcon("images/images_menu/menu_highscore_off.png");
		
		imageExit_on = new ImageIcon("images/images_menu/menu_exit_on.png");
		imageExit_off = new ImageIcon("images/images_menu/menu_exit_off.png");
		
		imageOptions_on = new ImageIcon("images/images_menu/menu_option_on.png");
		imageOptions_off = new ImageIcon("images/images_menu/menu_option_off.png");
		
		imageIntroduce_on = new ImageIcon("images/images_menu/menu_introduce_on.png");
		imageIntroduce_off = new ImageIcon("images/images_menu/menu_introduce_off.png");
		
		imageHelp_on = new ImageIcon("images/images_menu/menu_help_on.png");
		imageHelp_off = new ImageIcon("images/images_menu/menu_help_off.png");
		
		 imageCheck_on = new ImageIcon("images/images_menu/option_check_on.png");
		 imageCheck_off = new ImageIcon("images/images_menu/option_check_off.png");	
		 
		 imageMapMoring_on = new ImageIcon("images/images_menu/option_mapmorning_on.png");
		 imageMapMoring_off = new ImageIcon("images/images_menu/option_mapmorning_off.png");
		
		 imageMapNight_on = new ImageIcon("images/images_menu/option_mapnight_on.png");
		 imageMapNight_off = new ImageIcon("images/images_menu/option_mapnight_off.png");
		
		 imageOk_on = new ImageIcon("images/images_menu/option_ok_on.png");
		 imageOk_off = new ImageIcon("images/images_menu/option_ok_off.png");
		
		 imageBackgroundOption = new ImageIcon("images/images_menu/option_background.png");
		 
		 imageBackgroundMenu = new ImageIcon("images/images_menu/menu_background.png");
		 
		 imageHighScoreBackground = new ImageIcon("images/images_menu/hightScore.jpg");
		 
		 imageHelpBackground = new ImageIcon("images/images_menu/help.png");
		 
		 imageIntroduceBackground = new ImageIcon("images/images_menu/introduce.png");
		 
		 iconImage = new ImageIcon("images/hello.png");
	}
	
	
}
