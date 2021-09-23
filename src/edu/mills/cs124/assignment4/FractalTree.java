package edu.mills.cs124.assignment4;
import java.util.Scanner;

import edu.stanford.cs.graphics.GLine;
import edu.stanford.cs.graphics.GWindow;

public class FractalTree extends GWindow {
	private int width, height; // width and height of the window
	double lengthFactorMin, lengthFactorMax; // how much to multiply the length each time
	double angleMin, angleMax; // the range of angles to use
	double thicknessFactor; // how much to multiple the length of a branch by to get width
	double trunkSize; // the length of the trunk
	int depth; // the overall depth of the fractal
	
	FractalTree(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
		
		lengthFactorMin = 0.75;
		lengthFactorMax = 0.75;
		angleMin = 30;
		angleMax = 30;
		thicknessFactor = 0.1;
		trunkSize = 100;
		depth = 0;
		
		scanner = new Scanner(System.in);
	}
	
	public void helper(double startX, double startY, double length, double angle, int depth) {
		
		
	}
	
	public void draw() {
		clear();
		helper(width/2, height, trunkSize, 90, depth);
	}
	
	
	private Scanner scanner;
	
	public void adjustSettings() {
		lengthFactorMin = adjust("Length Factor Min", lengthFactorMin, false);
		lengthFactorMax = adjust("Length FactorMax", lengthFactorMax, false);
		angleMin = adjust("Angle Min", angleMin, false);
		angleMax = adjust("Angle Max", angleMax, false);
		thicknessFactor = adjust("Thickness Factor", thicknessFactor, false);
		trunkSize = adjust("Trunk Size", trunkSize, false);
		depth = (int) adjust("Depth", depth, true);
	}
	
	private double adjust(String name, double current, boolean isInt) {
		double userAnswer = inputDouble(name + "(current = " + current + ")", isInt);
		return userAnswer == -999 ? current : userAnswer;
	}
	private double inputDouble(String prompt, boolean needInt) {
		System.out.print(prompt + ": ");
		while (true) {
			try {
				String line = scanner.nextLine();
				if (line.isEmpty())
					return -999;
				double d = Double.parseDouble(line);
				if (d <= 0) 
					System.out.print("   *** Must be a positive number: ");
				if (needInt && Math.floor(d) != d)
						System.out.print("   *** Must be a whole number: ");
				return d;
			} catch (Exception e) {
				System.out.print("   *** Not a number, try again: ");
			}
		}
	}
	
}
