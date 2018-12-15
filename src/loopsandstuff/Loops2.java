package loopsandstuff;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
								   //0   1  2 3 4 5 6 7 8   9
		int[] intArray = new int[] {100,200,3,4,5,6,7,8,900,10};
		int[] intArray2 = new int[] {5,2,3};
		int[] intArray3 = new int[] {5};
		
		System.out.println("sum: " + SumArray(intArray));
		System.out.println("sum: " + SumArray(intArray2));
		System.out.println("sum: " + SumArray(intArray3));
		
		System.out.println("reversed: ");
		int[] reversed = ReverseArray(intArray);
		for(int i = 0; i < reversed.length; i++) {
			System.out.print(" " + reversed[i]);
		}
		System.out.println();
		
		System.out.println("reversedString: " + ReverseString("Hallo ich bin Marvin"));
	}
	
	/**
	 * Berechnet die Summe eines jeden Elements eines Arrays aus Integern.
	 * @param array das Array das summiert werden soll
	 * @return die Summe aller Elemente des Arrays
	 */
	public static int SumArray(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i = i + 1) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * Kehrt die Reihenfolge der Elemente eines Arrays um.
	 * Beispiel: {1,2,3,4} --> {4,3,2,1}
	 * @param array
	 * @return 
	 */
	public static int[] ReverseArray(int[] array) {
		int[] temp = new int[array.length]; //Erstelle ein Array der gleichen Länge
		
		for(int i = 0; i < array.length; i++) {
			int reverseIndex = (array.length - 1) - i;
			temp[i] = array[reverseIndex];
		}
		
		return temp;
	}
	
	/**
	 * Kehrt die Reihenfolge einer Zeichenkette um.
	 * Beispiel: "abcd" --> "dcba"
	 * @param str
	 * @return
	 */
	public static String ReverseString(String str) {
		String reversed = "";
		
		for(int i = (str.length()-1); i >= 0; i--) {
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	/**
	 * Findet den Maximalwert in einem Integer-Array.
	 * @param array
	 * @return Maximalwert auf dem array
	 */
	public static int maxInt(int[] array) {
		return -1;
	}
	
	/**
	 * Findet den Minimalwert in einem Integer-Array.
	 * @param array
	 * @return Minimalwert auf dem array
	 */
	public static int minInt(int[] array) {
		return -1;
	}
	
	/**
	 * Sortiert ein Integer-Array in aufsteigender Reihenfolge.
	 * Beispiel: {5,3,4,1,2} --> {1,2,3,4,5}
	 * @param array
	 * @return das aufsteigend sortierte Array
	 */
	public static int[] SortArray(int[] array) {
		return null;
	}

}
