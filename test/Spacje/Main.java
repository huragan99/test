package space;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * http://pl.spoj.com/problems/JSPACE/
 */

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<String> listOfLine = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { 
			while (br.ready()) {
				listOfLine.add(br.readLine());
				}
		}
		Main.splitAndUp(listOfLine);
	}
	
	public static void splitAndUp(List<String> list) {
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < list.size(); i++) {
			String result = "";
			String tmp = list.get(i);
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.substring(j,  j + 1).matches("\\s{1}")) {
				result += tmp.substring(j + 1, j + 2).toUpperCase();
				j++;
				} 
				else {
					result += tmp.substring(j, j + 1);	
				}
			}
			String[] listLine = result.split("[ \t]");
			for (String s : listLine) {
				pw.print(s);
			}
			pw.println();
			pw.flush();
		}
	}
		
}
