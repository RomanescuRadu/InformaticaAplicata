
public class Dreptunghi implements FiguraGeometrica {
	private int latime;
	private int lungime;

	public Dreptunghi(int latime,int lungime) {
		this.latime=latime;
		this.lungime=lungime;
	}

	@Override
	public void afisareForma() {
		System.out.println("Dreptunghi cu : latimea: "+latime+" lungimea: "+lungime);
	}
}
