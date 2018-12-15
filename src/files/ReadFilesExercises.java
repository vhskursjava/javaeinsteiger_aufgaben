package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFilesExercises {

	public static void main(String[] args) throws IOException {
		String meinTextFilePfad = ".\\res\\mock_data.csv";
		
		List<String> allLines = Files.readAllLines(Paths.get(meinTextFilePfad), StandardCharsets.UTF_8);
		
	}
	
	/**
	 * Gibt alle Daten in dem Feld first_name auf der Console aus.
	 * @param lines
	 */
	public static void PrintAllFirstNames(List<String> lines) {
		for(int i = 0; i < lines.size(); i++) {
			String[] csvLine = lines.get(i).split(",");
			System.out.println(csvLine[1]);
		}
	}
	
	/**
	 * Gibt die Zeilenanzahl zurück.
	 * @param lines
	 * @return
	 */
	public static int GetLineCount(List<String> lines) {
		return -1;
	}
	
	/**
	 * Gibt von jeder Zeile den ersten und den letzten Wert aus.
	 * @param lines
	 */
	public static void PrintFirstAndLast(List<String> lines) {
		System.out.println("Noch ist nichts implementiert :((");
	}
	
	/**
	 * Zählt die Vorkommen eines Geschlechts (Feld gender).
	 * Wenn male true ist, soll das Geschlecht "Male" gewählt werden,
	 * "Female" andererseits.
	 * @param lines
	 * @param male
	 * @return
	 */
	public static int CountGender(List<String> lines, boolean male) {
		return -1;
	}
	
	/**
	 * Zähle das gesamte Geld aus dem Feld money zusammen.
	 * Bedenke, dass du evtl. das Dollarzeichen entfernen musst, bevor du den Wert parsed!
	 * @param lines
	 * @return
	 */
	public static double CountMoney(List<String> lines) {
		return -1;
	}
	
	

}
