package stack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * http://pl.spoj.com/problems/STOS/
 */

public class Main {
	
	final int[] stack = new int[10];
	private int countStackFill = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		main.readStackData("C:\\Users\\Public\\odczyt.txt");

	}
	
	public void readStackData(String filePath) {
		try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
			String sign;
			while ((sign = in.readLine()) != null) {
				if (sign.equals("+")) {
					push(Integer.valueOf(in.readLine()));
				}
				else if (sign.equals("-")) {
					pop();
				}
				else {
					System.out.println("Wrong input");
				}
			}
		}
		catch (IOException e) {}
	}
	
	void pop() {
		if (getCountStackFill() != 0) {
			System.out.println(this.stack[this.countStackFill - 1]);
			this.stack[this.countStackFill - 1] = -1;
			this.countStackFill--;
		}
		else {
			System.out.println(":(");
		}
	}
	
	void push (int num) {
		if (getCountStackFill() < 10) {	
			this.stack[this.countStackFill] = num;
			this.countStackFill++;
			System.out.println(":)");
		}
		else {
			System.out.println(":(");
		}
	}
	
	public int getCountStackFill() {
		return countStackFill;
	}

}
