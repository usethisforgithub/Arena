
import java.awt.Color;
import java.awt.Frame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;



public class ArenaWindow extends Frame implements WindowListener, Runnable, KeyListener, MouseListener{

	//window stuff
	private boolean isRunning,isDone;
	private Image imgBuffer;
	
	private BufferedImage background;
	
	private int windowX, windowY;
	
	
	private ArrayList<Character> characterList;
	private Character myCharacter;
	
	
	
	
	

	
	public ArenaWindow(BufferedImage bg, ArrayList<Character> charlist, int playerID){
		super();
		
		
		characterList = charlist;
		myCharacter = characterList.get(playerID);
		
		
		
		
		
		
		background = bg;
		
		windowX = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();//6 + background.getWidth();
		windowY = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();//28 + background.getHeight();
		
		
		
		imgBuffer = this.createImage(windowX, windowY);
		
		
		
		
		
		
		
		//more window stuff
		this.addWindowListener(this);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.setSize(windowX,windowY);
		this.setTitle("Title");
		isRunning = true;
		isDone = false;
		this.setUndecorated(true);
		this.setVisible(true);
		this.setResizable(false);
		
		
		
		
	}
	
	public void run(){
		while(isRunning){
			draw();
			
			//System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth() + " x " + Toolkit.getDefaultToolkit().getScreenSize().getHeight());
			
			
			
			
			try{
				Thread.sleep(100);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
		}
		isDone = true;
	}
	
	
	public void draw(){
		imgBuffer = this.createImage(this.getWidth(), this.getHeight());
		Graphics2D g2 = (Graphics2D)imgBuffer.getGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//background color
		g2.setColor(Color.black);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
				
		
		
		g2.drawImage(background, (this.getWidth()/2)-(background.getWidth()/2), (this.getHeight()/2)-(background.getHeight()/2), null);
		
		for(int i = 0; i < characterList.size(); i++){
			characterList.get(i).draw(g2);
		}	
		
		g2 = (Graphics2D)this.getGraphics();
		g2.drawImage(imgBuffer, 0, 0, this.getWidth(), this.getHeight(), 0, 0, this.getWidth(), this.getHeight(), null);
		g2.dispose();
	}
	
	
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		while(true){
			if(isDone){
				System.exit(0);
			}try{
				Thread.sleep(100);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		isRunning = false;
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
