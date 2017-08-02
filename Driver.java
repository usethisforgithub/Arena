import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Driver {
	public static void main(String[] args) throws IOException{
		
		
		BufferedImage arena;
		arena = ImageIO.read(new File("arena.png"));
		
		ArrayList<Character> c = new ArrayList<Character>();
		
		ArenaWindow window = new ArenaWindow(arena,c,0);
		new Thread(window).start();
	}
}
