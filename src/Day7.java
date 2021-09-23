import java.util.Scanner;

import edu.stanford.cs.graphics.GPoint;

public class Day7 {


	
	
	public static void main(String[] args) {
		FractalTree tree = new FractalTree(600, 600);
		while (true) {
			tree.adjustSettings();
			System.out.println("Drawing...");
			tree.draw();
			System.out.println("Done.\n");
		}
	}
		   
}