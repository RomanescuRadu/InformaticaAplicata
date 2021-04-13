
public class Patrat implements FiguraGeometrica{
private int latime;
private int lungime;

public Patrat(int latime,int lungime) {
	this.latime=latime;
	this.lungime=lungime;
}

@Override
public void afisareForma() {
	System.out.println("Patrat cu : Latimea: "+latime+" Lungimea: "+lungime);
}

}
