import java.util.Scanner;

import edu.stanford.cs.graphics.GPoint;

public class Day7 {

	public static void countdown(int n) {
		// base case
		if (n == 0) {
			System.out.println("Blastoff!");
			return;
		}
		
		// recursive step
		System.out.println(n);
		countdown(n-1);
	}
	
	public static int power17(int n) {
		// base case
		if (n == 0)
			return 1;
		// recursive step
		return 17 * power17(n-1); 
	}
	
	public static boolean isTriple(int n) {
		// base cases
		if (n == 3)
			return true;
		if (n < 3)
			return false;
		
		// recursive step
		boolean nIsMultipleOf3 = isTriple(n - 3);
		return nIsMultipleOf3;
	}
	
	public static int countEs(String s) {
		// base case
		if (s.isEmpty()) 
			return 0;
		// recursive step
		if (s.charAt(0) == 'e') 
			return 1 + countEs(s.substring(1));
		else 
			return 0 + countEs(s.substring(1));
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		countdown(10);
		
		System.out.println(power17(3));
		
		System.out.println(isTriple(100));
		System.out.println(isTriple(81));
		
		System.out.println(countEs("telephone wire"));			
	}
		   
}