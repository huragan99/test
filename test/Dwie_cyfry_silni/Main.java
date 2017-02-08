package dwie.cyfry.silni;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * http://pl.spoj.com/problems/FCTRL3/
 */

public class Main {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		
		int[] tabOfN = null;
		try (Scanner sc = new Scanner(System.in)) {
			if (sc.hasNextInt()) {
				tabOfN = new int[sc.nextInt()];
				for (int i = 0; i < tabOfN.length; i++) {
					tabOfN[i] = sc.nextInt();
				}
			}
		}
		catch (InputMismatchException e) {}
		for (int num : tabOfN) {
			System.out.println(Main.factorial(num));
			Main.showFactorial(factorial(num));
		}
	
	}
	
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
	
	static void showFactorial(int num) {
		System.out.println(((num - num%10)/10) + " " + num%10);
	}

}
