package week4;

/**
 * Overloading method example
 */
public class OverloadingMethods {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String [] args) {
		System.out.println("The minimum of 5 and 6 is " + min (5,7));
		
		System.out.println("The minimum of 5.4 and 5.1 is " + min (5.4,5.1));
		
		System.out.println("The minimum of 5.5 and 5.2, and 5.3 is " + min (5.5,5.2,5.3));
	}
	
	/**
	 * Min method taking in two integer parameters
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	/**
	 * Min method taking in two double parameters
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double min(double num1, double num2) {
		if(num1 < num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	/**
	 * Min method taking in two double parameters
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double min(double num1, double num2, double num3) {
		double min1 = min(num1, num2);
		double min2 = min(min1, num3);
		return min2;
		
		// you can also write this is return min(num1,min(num2,num3));
	}
	
	
}
