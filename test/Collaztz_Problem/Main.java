package collatz.program;

import java.util.InputMismatchException;

/*
 * http://pl.spoj.com/problems/PTCLTZ/
 */

import java.util.Scanner;

public class Main {
	
	static final int N_STEP = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfX = null;
		try (Scanner sc = new Scanner(System.in)) {
			if (sc.hasNextInt()) {
				arrayOfX = new int[sc.nextInt()];
				for (int i = 0; i <arrayOfX.length; i++) {
					arrayOfX[i] = sc.nextInt();
				}
			}
		}
		catch (InputMismatchException e) {}
		Main.collatzProblem(arrayOfX);
	}
	
	public static void collatzProblem(int[] arrayOfX) {
		for (int i = 0; i < arrayOfX.length; i++) {
			int n = 0;
			int x = arrayOfX[i];
			while (x != N_STEP) {
				if (x % 2 == 0) {
					x /= 2;
					n++;
				}
				else {
					x = (x * 3) + 1;
					n++;
				}
			}
			System.out.println(n);
		}
	}

}
