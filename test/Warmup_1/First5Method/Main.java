package codingbat5first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EveryNChars
		EveryNChars testForENC = new EveryNChars();
		String result = testForENC.everyNth("Kamil", 2);
		System.out.println("Kamil co 2 to: "+ result);
		
		//SleepIn
		SleepIn sleep = new SleepIn();
		System.out.println("Mam spaæ ? " + sleep.sleepIn(false, false));
		
		//MonkeyTrouble
		MonkeyTrouble monkey = new MonkeyTrouble();
		System.out.println("Are we in trouble ? " + monkey.monkeyTrouble(false, false));
		
		//SumDouble
		SumDouble firstSum = new  SumDouble();
		System.out.printf("Suma dla rownych liczb wynosi %d, a dla roznych %d\n", 
				firstSum.sumDouble(3, 3), firstSum.sumDouble(3, 5));;
				
		//Diff21
		Diff21 nNumber = new Diff21();
		System.out.println("Wartosc absolutna miedzy n(<21) a 21 wynosi " + nNumber.diff21(19) 
		+ " a dla wiekszego " + nNumber.diff21(25));
		
		//
	}
}
