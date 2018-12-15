package objektorientierung;

public class Rechteck {

	//Membervariablen
	private double seiteA;
	private double seiteB;
	
	//Konstruktoren
	public Rechteck() {
		seiteA = 0.0;
		seiteB = 0.0;
	}
	
	public Rechteck(double a, double b) {
		setA(a);
		setB(b);
	}
	
	//Getter
	public double getA() {
		return this.seiteA;
	}
	public double getB() {
		return this.seiteB;
	}
	//Setter
	public void setA(double a) {
		this.seiteA = a;
	}
	public void setB(double b) {
		this.seiteB = b;
	}
	
	//Methoden
	public double flaeche() {
		return this.seiteA * this.seiteB;
	}
	
	public double umfang() {
		return 2.0 * (this.seiteA + this.seiteB);
	}
	
	public double diagonale() {
		return Math.sqrt(seiteA*seiteA + seiteB*seiteB);
	}
	
	public double umkreisRadius() {
		return 0.5 * diagonale();
	}
}
