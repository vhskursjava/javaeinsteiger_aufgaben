package loopsandstuff;

public class Loops1 {

	public static void main(String[] args) {
		
		//�bung 1:
		//Erstelle eine while-Schleife, die die Zahlen von 0 bis 9 als eine Zeichenkette zusammenf�gt.
		//Die Zeichenkette soll wie folgt aussehen: 0123456789
		//Gebe die Zeichenkette anschlie�end auf der Console (zur Kontrolle) aus.
		//L�sung:
		String nullBisNeun = "";
		int index1 = 0;
		while(index1 < 10) {
			nullBisNeun += index1; //Konkatiniere jeweils den Wert aus i als String an die Zeichenkette nullBisNeun
			index1++; //Inkrementiere index1 um 1
		}
		System.out.println("Ergebnis 1: " + nullBisNeun);
		
		//�bung 2:
		//Erstelle eine while-Schleife, die die Zahlen von 1 bis 100 addiert.
		//Gebe anschlie�end das Ergebnis auf der Console aus
		//Tipp: Du ben�tigst eine weitere Variable, auf die du die Werte jeweils aufaddierst (1+2+3+...+100).
		int addVonEinsBisHundert = 0;
		int index2 = 1;
		while(index2 <= 100) {
			addVonEinsBisHundert = addVonEinsBisHundert + index2;
			index2++;
		}
		System.out.println("Ergebnis 2: " + addVonEinsBisHundert);
		
		
		//�bung 3:
		//Erstelle eine while-Schleife, die nur die gerade Zahlen von 0 bis 100 addiert.
		//Gebe anschlie�end das Ergebnis auf der Console aus (Ergebnis 2550)
		int addEven = 0;
		int index3 = 0;
		while(index3 <= 100) {
			if(index3 % 2 == 0) {
				addEven += index3;
			}
			index3++;
		}
		System.out.println("Ergebnis 3: " + addEven);
		
		//�bung 4:
		//Erstelle eine while-Schleife, die nur die ungerade Zahlen von 0 bis 100 addiert.
		//Gebe anschlie�end das Ergebnis auf der Console aus (Ergebnis 2500)

		
	}

}
