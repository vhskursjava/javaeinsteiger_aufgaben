package warmup;

public class WarmUp1 {

	
	/**
	 * The method returns true, if the parameter num is greater than 100, false otherwise.
	 * 
	 * greaterThan100(110) --> true
	 * greaterThan100(60) --> false
	 */
	public static boolean greaterThan100(int num) {

		boolean returnValue = false; //Definition einer Variable, die spaeter zur�ckgegeben werden soll (return)
		if(num > 100) {
			returnValue = true; //num ist groesser als 100, also wird returnValue auf true gesetzt
		} else {
			returnValue = false; //in allen anderen Faellen ist num kleiner als 100, also wird returnValue auf false gesetzt
		}
		return returnValue; //zum Schluss muss returnValue (also das Ergebnis) mittels return-Anweisung zurückgegeben werden
	}
	
	/**
	 * The method returns true, if the parameter num is even, false otherwise.
	 * 
	 * isEven(60) --> true
	 * isEven(11) --> false
	 */
	public static boolean isEven(int num) {
		return (num % 2) == 0;
	}
	
	/**
	 * The parameter weekday is true if it is a weekday, and the parameter vacation
	 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
	 * vacation. Return true if we sleep in.
	 * 
	 * sleepIn(false, false) --> true
	 * sleepIn(true, false) --> false
	 * sleepIn(false,true) --> true
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
	 * if each is smiling. We are in trouble if they are both smiling or if neither
	 * of them is smiling. Return true if we are in trouble.
	 * 
	 * monkeyTrouble(true, true) --> true
	 * monkeyTrouble(false, false) --> true
	 * monkeyTrouble(true, false) --> false
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile != bSmile);
	}

	/**
	 * Given two int values, return their sum. Unless the two values are the same,
	 * then return double their sum.
	 * 
	 * sumDouble(1, 2) --> 3
	 * sumDouble(3, 2) --> 5
	 * sumDouble(2, 2) --> 8
	 */
	public static int sumDouble(int a, int b) {
		return a == b ? (a + b) * 2 : a + b;
	}

	/**
	 * Given an int n, return the absolute difference between n and 21, except
	 * return double the absolute difference if n is over 21.
	 * 
	 * diff21(19) --> 2
	 * diff21(10) --> 11
	 * diff21(21) --> 0
	 */
	public static int diff21(int n) {
		return n <= 21 ? 21 - n : (n - 21) * 2;
	}

	/**
	 * We have a loud talking parrot. The "hour" parameter is the current hour time
	 * in the range 0..23. We are in trouble if the parrot is talking and the hour
	 * is before 7 or after 20. Return true if we are in trouble.
	 * 
	 * parrotTrouble(true, 6) --> true
	 * parrotTrouble(true, 7) --> false
	 * parrotTrouble(false, 6) --> false
	 */
	public static boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	/**
	 * Given 2 ints, a and b, return true if one of them is 10 or if their sum is
	 * 10.
	 * 
	 * makes10(9, 10) --> true
	 * makes10(9, 9) --> false
	 * makes10(1, 9) --> true
	 */
	public static boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}

	/**
	 * 
	 * Given an int n, return true if it is within 10 of 100 or 200. Note:
	 * Math.abs(num) computes the absolute value of a number (num).
	 * 
	 * nearHundred(93) --> true
	 * nearHundred(90) --> true
	 * nearHundred(89) --> false
	 * nearHundred(101) --> true
	 * nearHundred(203) --> true
	 */
	public static boolean nearHundred(int n) {
		return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
	}

	/**
	 * 
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both are
	 * negative.
	 * 
	 * posNeg(1, -1, false) --> true
	 * posNeg(-1, 1, false) --> true
	 * posNeg(-4, -5, true) --> true
	 */
	public static boolean posNeg(int a, int b, boolean negative) {
		return negative ? (a < 0 && b < 0) : (b < 0 && a >= 0) || (a < 0 && b >= 0);
	}
}
