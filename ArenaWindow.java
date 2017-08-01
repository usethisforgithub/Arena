
import java.awt.Color;
import java.awt.Frame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;



public class ArenaWindow extends Frame implements WindowListener, Runnable, KeyListener, MouseListener{

	//window stuff
	private boolean isRunning,isDone;
	private Image imgBuffer;
	
	private BufferedImage background;
	
	private int windowX, windowY;
	
	
	
	
	private int[] currentAnimationSequence;
	private int[] walkingRight = {34,35,36,37,38,39};
	private int[] walkingLeft = {14,15,16,17,18,19};
	private int[] walkingUp = {4,5,6,7,8,9};
	private int[] walkingDown = {24,25,26,27,28,29};
	private int[] attackingRight = {30,31,32,32,33,34,34,34};
	private int[] attackingLeft = {10,11,12,12,13,14,14,14};
	private int[] attackingUp = {0,1,2,2,3,4,4,4};
	private int[] attackingDown = {20,21,22,22,23,24,24,24};
	private int[] standingLeft = {14};
	private int[] standingRight = {34};
	private int[] standingUp = {4};
	private int[] standingDown = {24};
	
	
	

	
	public ArenaWindow(BufferedImage bg){
		super();
		
		
		
		
		
		currentAnimationSequence = walkingRight;
		
		
		background = bg;
		
		windowX = 6 + background.getWidth();
		windowY = 28 + background.getHeight();
		
		
		
		imgBuffer = this.createImage(windowX, windowY);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		//more window stuff
		this.addWindowListener(this);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.setSize(windowX,windowY);
		this.setTitle("Title");
		isRunning = true;
		isDone = false;
		this.setVisible(true);
		
		this.setResizable(false);
		
		
		
		
	}
	
	public void run(){
		while(isRunning){
			draw();
			
			
			
			
			
			
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
		g2.setColor(Color.white);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
				
		
		
		g2.drawImage(background, 3, 25, null);
		
			
		
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
