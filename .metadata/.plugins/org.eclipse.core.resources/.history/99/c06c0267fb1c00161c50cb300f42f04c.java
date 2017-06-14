package shroudeddreams.main.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int  width = 87, height = 135,width2 = 84, height2 = 32,width3 = 110, height3 = 110;
	
	 ;
	public static BufferedImage player, leftplayer, frontplayer, backplayer,sleepplayer, wakingplayer, tiredplayer, sittingplayer, friend, grass, stone, cloud, city, portal1, portal2, portal3, portal4, shack, buildingboss, smallplayer, tree, rock, cave;;
	
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/MainCharacter.png"));
		
		player = sheet.crop(27,7,width, height);
		leftplayer = sheet.crop(185, 8, width, height);
		frontplayer = sheet.crop(330, 8, width, height);
		backplayer = sheet.crop(494, 7, width, height);
		//different value when character is sitting
		sleepplayer = sheet.crop(35, 152, width2, height2);
		wakingplayer = sheet.crop(179, 154, width2, height2);
		tiredplayer = sheet.crop(328, 155, width2, height2);
		sleepplayer = sheet.crop(472, 159, width2, height2);
		
		SpriteSheet Tiles = new SpriteSheet(ImageLoader.loadImage("/textures/MainCharacter2.png"));
		
		city = Tiles.crop(87, 0, width3, height3);
		grass = Tiles.crop(87, width3, width3, height3);
		stone = Tiles.crop(417, 0, width3, height3);
		
		
		SpriteSheet Buildings = new SpriteSheet(ImageLoader.loadImage("/textures/Buildings.png"));
		shack = Buildings.crop(70, 0, 414, 398);
	
	}
	
}
