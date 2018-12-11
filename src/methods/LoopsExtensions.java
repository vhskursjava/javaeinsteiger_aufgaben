package methods;

public class LoopsExtensions {
	
	public static void main(String[] args) {
		System.out.println("-- Testausgaben der Methode uebung1 --");
		System.out.println(uebung1(0, 9));
		System.out.println(uebung1(5, 20));
		System.out.println(uebung1(-10, 10));
		System.out.println("-- Testausgaben der Methode uebung2 --");
		//Füge hier evtl. weitere Testausgaben weiterer Methoden ein
	}

	public static String uebung1(int von, int bis) {
		String concatValue = "";
		int index = von;
		while(index <= bis) {
			concatValue += index;
			index++;
		}
		return concatValue;
	}
	
	public static int uebung2(int von, int bis) {
		//TODO implementiere die methode richtig!
		return -1; //Das ist nur ein Dummy-Wert; Überschreibe dieses return-Statement mit einem korrekten!
	}
	
	//TODO füge hier die weiteren methoden uebung3 und uebung4 hinzu
}
