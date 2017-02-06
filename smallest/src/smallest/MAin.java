package smallest;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * http://pl.spoj.com/problems/LESSTHAN/
 */

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger[] list = MAin.readNumbers();
		Arrays.sort(list);
		System.lineSeparator();
		BigInteger[] list2 = MAin.readNumbers();
		
		MAin.lessThan(list, list2);

	}
	
	public static BigInteger[] readNumbers() {
		 BigInteger[] list = null;
		
		try {
			Scanner sc = new Scanner(System.in); 
			int size = sc.nextInt();
			list = new BigInteger[size];
			for (int i = 0; i < size; i++) {
				list[i] = sc.nextBigInteger();
			}
		}
		catch (NoSuchElementException e) {}
		return list;
	}
	
	public static void lessThan(BigInteger[] setNum, BigInteger[] lessNumSet) {
		List<Integer> numOfLess = new ArrayList<>();
		for (int i = 0; i < lessNumSet.length; i++) {
			Integer less = Arrays.binarySearch(setNum, lessNumSet[i]);
			if (less > 0) {
				numOfLess.add(less);
			}
			else {
			numOfLess.add((-less) - 1);
			}
		}
		for (Integer i : numOfLess) {
			System.out.println(i);
		}
	}
	

}
