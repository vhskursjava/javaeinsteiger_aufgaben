package objektorientierung;

public class TestKlasse {

	public static void main(String[] args) {
		Rechteck r = new Rechteck(10.0, 12.5);
		
		System.out.println("a: " + r.getA());
		System.out.println("b: " + r.getB());
		System.out.println("fläche: " + r.flaeche());
		System.out.println("umfang: " + r.umfang());
		System.out.println("diagonale: " + r.diagonale());
		System.out.println("umkreisradius: " + r.umkreisRadius());
	}

}
