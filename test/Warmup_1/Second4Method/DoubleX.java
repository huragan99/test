package codingbat5second;

public class DoubleX {
	
	public DoubleX() {
	}
	
	boolean doubleX(String str) {
		  int firstX = str.indexOf('x');
		  if ((str.length() < 2) || (firstX >= str.length()-1)) {
		    return false;
		  }
		  return str.substring(firstX+1, firstX+2).equals("x"); 
		}
}
