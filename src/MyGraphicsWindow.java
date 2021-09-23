import java.awt.Color;

import edu.stanford.cs.graphics.*;

public class MyGraphicsWindow extends GWindow {
	private int width;
	private int height;
	
	// constructor
	MyGraphicsWindow(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		// create a graphics object
		GRect rect1 = new GRect(100, 100, 300, 200);
		// add it to the window
		rect1.setFilled(true);
		rect1.setFillColor(Color.MAGENTA);
		add(rect1);
	}
	
	private void drawCheckersHelper(double x, double y, double side, int depth) {
		// base case
		if (depth == 0) {
			GRect rect = new GRect(x, y, side, side);
			rect.setFilled(true);
			rect.setFillColor(Color.CYAN);
			add(rect);
		} else {
			double s = side/3;
			// recursively call the helper 5 times
			// upper boxes
			drawCheckersHelper(x, y, s, depth-1);
			drawCheckersHelper(x+2*s, y, s, depth-1);
			// lower boxes
			drawCheckersHelper(x, y+2*s, s, depth-1);
			drawCheckersHelper(x+2*s, y+2*s, s, depth-1);
			// center
			drawCheckersHelper(x+s, y+s, s, depth-1);
			
		}
	}
	
	public void drawCheckers(int depth) {
		drawCheckersHelper(0, 0, width, depth);
	}
	
}
