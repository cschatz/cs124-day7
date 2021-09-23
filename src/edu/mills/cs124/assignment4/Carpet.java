package edu.mills.cs124.assignment4;
import edu.stanford.cs.graphics.*;

public class Carpet extends GWindow {
		
	private int width, height;
	
	Carpet(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}
	
	private void drawHelper(double cornerX, double cornerY, double side, int depth) {
		
	}
	
	public void draw(int depth) {
		// This method is ALREADY COMPLETE.
		// Your code goes in the helper method above.
		drawHelper(0, 0, width, depth);
	}
	
}
