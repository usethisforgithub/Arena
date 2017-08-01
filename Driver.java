import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Driver {
	public static void main(String[] args) throws IOException{
		
		
		BufferedImage arena;
		arena = ImageIO.read(new File("arena.png"));
		
		
		ArenaWindow window = new ArenaWindow(arena);
		new Thread(window).start();
	}
}
