package loopsandstuff;

public class Loops1 {

	public static void main(String[] args) {
		
		//Übung 1:
		//Erstelle eine while-Schleife, die die Zahlen von 0 bis 9 als eine Zeichenkette zusammenfügt.
		//Die Zeichenkette soll wie folgt aussehen: 0123456789
		//Gebe die Zeichenkette anschließend auf der Console (zur Kontrolle) aus.
		//Lösung:
		String nullBisNeun = "";
		int index1 = 0;
		while(index1 < 10) {
			nullBisNeun += index1; //Konkatiniere jeweils den Wert aus i als String an die Zeichenkette nullBisNeun
			index1++; //Inkrementiere index1 um 1
		}
		System.out.println("Ergebnis 1: " + nullBisNeun);
		
		//Übung 2:
		//Erstelle eine while-Schleife, die die Zahlen von 1 bis 100 addiert.
		//Gebe anschließend das Ergebnis auf der Console aus
		//Tipp: Du benötigst eine weitere Variable, auf die du die Werte jeweils aufaddierst (1+2+3+...+100).

		
		//Übung 3:
		//Erstelle eine while-Schleife, die nur die gerade Zahlen von 0 bis 100 addiert.
		//Gebe anschließend das Ergebnis auf der Console aus (Ergebnis 2550)

		
		//Übung 4:
		//Erstelle eine while-Schleife, die nur die ungerade Zahlen von 0 bis 100 addiert.
		//Gebe anschließend das Ergebnis auf der Console aus (Ergebnis 2500)

		
	}

}
