package edu.mills.cs124.assignment4;

import java.util.Scanner;

public class Assignment4 {

	public static int digitSum(int n) {
		
		
		// FAKE return value! You should delete this when you start writing the method.
		return -999;
	}
	
	public static int maxValue(int[] numbers) {

		// FAKE return value! You should delete this when you start writing this method.
		return -999;
	}

	private static int maxValueHelper(int[] numbers, int i) {
		
		// FAKE return value! You should delete this when you start writing this method.
		return -999;
	}
	
	public static boolean sumExists(int[] numbers, int sum) {
	
		// FAKE return value! You should delete this when you start writing this method.
		return false;
	}
	
	private static boolean sumExistsHelper(int[] numbers, int sum, int i, int k) {
		
		// FAKE return value! You should delete this when you start writing this method.
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// ===================================
		// The code below demonstrates how
		// to use the classes provided for
		// you in tasks #3 and #4
		// ===================================
		Carpet carpet = new Carpet(600, 600);
		carpet.draw(3);
		
		FractalTree tree = new FractalTree(800, 600);
		while (true) {
			System.out.print("Type enter to draw next tree, anything else to stop: ");
			String line = scanner.nextLine();
			if (! line.isEmpty())
				break;
			tree.adjustSettings();
			tree.draw();
		}
		System.out.println("Done");
		scanner.close();
		
		carpet.dispose();
		tree.dispose();
	}

}
