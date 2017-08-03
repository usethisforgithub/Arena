import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Character {

	private BufferedImage[] images;
	private int[] currentAnimationSequence;
	private int[] nextAnimationSequence;
	private int moveSpeed, poseControl, xpos, ypos,ID;
	private String facing;
	//String[] moveSet;
	
	public final int[] walkingRight = {34,35,36,37,38,39};
	public final int[] walkingLeft = {14,15,16,17,18,19};
	public final int[] walkingUp = {4,5,6,7,8,9};
	public final int[] walkingDown = {24,25,26,27,28,29};
	public final int[] attackingRight = {30,31,32,32,33,34,34,34};
	public final int[] attackingLeft = {10,11,12,12,13,14,14,14};
	public final int[] attackingUp = {0,1,2,2,3,4,4,4};
	public final int[] attackingDown = {20,21,22,22,23,24,24,24};
	public final int[] standingRight = {34};
	public final int[] standingLeft = {14};
	public final int[] standingUp = {4};
	public final int[] standingDown = {24};
	
	public Character(BufferedImage[] im, String fa, int ms,int id, int x, int y ){
		images = im;
		facing = fa;
		moveSpeed = ms;
		ID = id;
		xpos = x;
		ypos = y;
	
		poseControl = 0;
		currentAnimationSequence = standingRight;
		nextAnimationSequence = standingRight;
		
	}
	
	public void draw(Graphics2D g2){
		System.out.println(ID);
		g2.drawImage(images[currentAnimationSequence[poseControl]], xpos, ypos, null);
	}
	
	
	
	public int[] getNextAnimationSequence() {
		return nextAnimationSequence;
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
	
	public int getID(){
		return ID;
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
	
	public void setNextAnimationSequence(int[] nas) {
		nextAnimationSequence = nas;
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
	
	public void animate() {
		poseControl++;
		if(poseControl >= currentAnimationSequence.length) {
			currentAnimationSequence = nextAnimationSequence;
			poseControl = 0;
		}
	}
}
