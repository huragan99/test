package codingbat5second;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FrontBack word = new FrontBack();
		System.out.println("Zamiana liter slowa 'KAMIL' na " + word.frontBack("KAMIL"));
		
		In3050 number = new In3050();
		System.out.println("Sa pomiedzy 30 i 40 lub 40 i 50 ? " + number.in3050(31, 37));
		
		DoubleX str = new DoubleX();
		System.out.println("Po pierwszym x nastepnym znakiem jest x " + str.doubleX("javaxx"));
		
		CalcSpoj test = new CalcSpoj();
		test.readAndCalc("C:\\Users\\Public\\odczyt.txt", 
				"C:\\Users\\Public\\zapis.txt");

	}

}
