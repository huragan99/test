package codingbat5second;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
* Link do zadania
* http://pl.spoj.com/problems/CALC/
*/ 

public class CalcSpoj {
	
	public void readAndCalc(String filePathIn, String filePathOut) throws IOException, StringIndexOutOfBoundsException {
		
		BufferedReader inputFile = null;
		FileWriter outputFile = null;
		String oneLine; 
		String[] tmpLine;
		int firstNum, secondNum, result = 0;
		inputFile = new BufferedReader(new FileReader(filePathIn));
		outputFile = new FileWriter(filePathOut);
		try {	
		while ((oneLine = inputFile.readLine()) != null) {
				System.out.println(oneLine);
				tmpLine = oneLine.split(" ");
				firstNum = Integer.parseInt(tmpLine[1]);
				secondNum = Integer.parseInt(tmpLine[2]);
				System.out.println(firstNum+ " " + secondNum);
				switch (tmpLine[0]) {
				case "+":result = firstNum + secondNum;
						  break;
				case "-": result = firstNum - secondNum;
				  		  break;
				case "*": result = firstNum * secondNum;
		  		  		  break;
				case "/": result = firstNum / secondNum;
		  		  		  break;
				case "%": result = firstNum % secondNum;
		  		  		  break;				
				}
				outputFile.write(Integer.toString(result));
				outputFile.write(System.lineSeparator());
		}
		System.out.println("testtttt");
		}
		finally {
			inputFile.close();
			outputFile.close();
		}
	}
	
	
}
