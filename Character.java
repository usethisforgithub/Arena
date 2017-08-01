import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Character {

	private BufferedImage[] images;
	private int[] currentAnimationSequence;
	private int moveSpeed, poseControl, xpos, ypos;
	private String facing;
	
	private final int[] walkingRight = {34,35,36,37,38,39};
	private final int[] walkingLeft = {14,15,16,17,18,19};
	private final int[] walkingUp = {4,5,6,7,8,9};
	private final int[] walkingDown = {24,25,26,27,28,29};
	private final int[] attackingRight = {30,31,32,32,33,34,34,34};
	private final int[] attackingLeft = {10,11,12,12,13,14,14,14};
	private final int[] attackingUp = {0,1,2,2,3,4,4,4};
	private final int[] attackingDown = {20,21,22,22,23,24,24,24};
	private final int[] standingLeft = {14};
	private final int[] standingRight = {34};
	private final int[] standingUp = {4};
	private final int[] standingDown = {24};
	
	public Character(){
		
	}
	
	public void draw(Graphics2D g2){
		g2.drawImage(images[currentAnimationSequence[poseControl]], xpos, ypos, null);
	}
	
	public int[] getCurrentAnimationSequence(){
		return currentAnimationSequence;
	}
	
	public int getMoveSpeed(){
		return moveSpeed;
	}
	
	public int getPoseControl(){
		return poseControl;
	}
	
	public int getxpos(){
		return xpos;
	}
	
	public int getypos(){
		return ypos;
	}
	
	public String getFacing(){
		return facing;
	}
	
	
	public void setCurrentAnimationSequence(int[] c){
		currentAnimationSequence = c;
	}
	
	public void setMoveSpeed(int m){
		moveSpeed = m;
	}
	
	public void setPoseControl(int p){
		poseControl = p;
	}
	
	public void setxpos(int x){
		xpos = x;
	}
	
	public void setypos(int y){
		ypos = y;
	}
	
	public void setFacing(String f){
		facing = f;
	}
}
