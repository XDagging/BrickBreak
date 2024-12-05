//  Class author:  Sebastian Hernandez-Tavares
//  Date created:  12/5/24
//  General description: Creates the paddle that can move to the left or to the right depending on the methods called upon the class.


import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	private int velocity;
	

	// player = new Paddle(310, 550, 100, 8);
	
	public Paddle(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		height = h;
		width = w;
	}


	//  Pre-condition: Needs a instance of the Graphics class as a parameter to be sent as a parameter.
	//  Post-condition: Redraws the instance with the xPos yPos and the width and height. 
	public void draw(Graphics f) {

		

		f.setColor(Color.white);
		f.fillRect(xPos, yPos, width, height);
	}

	public int getX() {
		return xPos;
	}

	public void setX(int value) {
		xPos = value;
	}

	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVelocity() {
		return velocity;
	}
	public void addVelocity(int add) {
		velocity = add;
	}



	//  Pre-condition: None
	//  Post-condition: Adds the velocity to the xPos.
	public void move() {
		xPos += velocity;
	}

	public void setVelocity(int newVelocity) {
		velocity = newVelocity;
	}
	// draw(Graphics)



	
	//methods:
	
	
}
