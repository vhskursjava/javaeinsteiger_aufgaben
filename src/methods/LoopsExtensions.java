package methods;

public class LoopsExtensions {
	
	public static void main(String[] args) {
		System.out.println("-- Testausgaben der Methode uebung1 --");
		System.out.println(uebung1(0, 9));
		System.out.println(uebung1(5, 20));
		System.out.println(uebung1(-10, 10));
		System.out.println("-- Testausgaben der Methode uebung2 --");
		System.out.println(uebung2(0, 100));
		System.out.println(uebung2(10, 5));
		System.out.println(uebung2(5, 10));
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
		if(von > bis) {
			int tmp = von;
			von = bis;
			bis = tmp;
		}
		
		int addVonEinsBisHundert = 0;
		int index2 = von;
		while(index2 <= bis) {
			addVonEinsBisHundert = addVonEinsBisHundert + index2;
			index2++;
		}
		return addVonEinsBisHundert;
	}
	
	//TODO füge hier die weiteren methoden uebung3 und uebung4 hinzu
}
