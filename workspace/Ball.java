import java.awt.*;

//  Class author:  Sebastian Hernandez-Tavares
//  Date created:  12/5/24
//  General description: Creates the ball class that represents the ball in the game brickbreak. This class is dependent on other files in this same folder. 

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	

	private int xPos;
    private int yPos;
	private int radius;
   	private int velocityX;
	private int velocityY;

	public Ball(int x, int y , int w) {
		xPos = x;
		yPos = y;
		radius = w;
	}

	//  Pre-condition: Needs a instance of the Graphics class as a parameter to be sent as a parameter.
	//  Post-condition: Redraws the instance with the xPos yPos and the width and height. 
	public void draw(Graphics f) {

		f.setColor(Color.orange);

		f.fillOval(xPos, yPos, radius, radius);
	}
	

    
	public int getYpos() {
		return yPos;
	}	

	public int getXpos() {
		return xPos;
	}	

	public int getSize() {
		return radius;
	}

	public void setXVelocity(int velocity) {
		velocityX = velocity;
	}
	public void setYVelocity(int velocity) {
		velocityY = velocity;
	}


	//  Pre-condition: None
	//  Post-condition: Adds the velocities for both x and y to the xposition and yposition.

	public void move(){
		xPos+=velocityX;
		yPos+=velocityY;
	}

	//  Pre-condition: None
	//  Post-condition: Will make instance attribute (velocityY) inverse aka go the other way
	public void reverseY() {
		velocityY *= -1;
	}


	//  Pre-condition: None
	//  Post-condition: Will make instance attribute (velocityX) inverse aka go the other way
	public void reverseX() {
		velocityX *= -1;
	}

	public void setX(int value) {
		xPos = value;
	}
	public void setY(int value) {
		yPos = value;
	}


	



	//constructor(s):
	
	//methods:

}
