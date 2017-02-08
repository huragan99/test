package prime.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * http://pl.spoj.com/problems/PRIME_T/
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] primeTab = null;
		try (Scanner sc = new Scanner(System.in)) {
			if (sc.hasNextInt()) {
				primeTab = new int[sc.nextInt()];
				for (int i = 0; i < primeTab.length; i++) {
					primeTab[i] = sc.nextInt();
				}
			}
		}
		catch (InputMismatchException e) {}
		Main.arePrime(primeTab);

	}
	
	public static void arePrime(int[] num) {
		for (int i = 0; i <= num.length; i++) {
			boolean primeFlag = true;
			if (num[i] == 1) {
				primeFlag = false;
			}
			int sqrt = (int)Math.sqrt(num[i]);
			for (int j = 2; j <= sqrt; j++) {
				if (num[i]%j == 0 ) {
				primeFlag = false;
				break;
				}
			}
			if (primeFlag) {
				System.out.println("TAK");
			} 
			else {
				System.out.println("NIE");
			}
		}
	}

}
