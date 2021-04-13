import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuOptions {
	Scanner inp=new Scanner(System.in);
	FormeBidimensionale patrat=new FormeBidimensionale();
	FormeBidimensionale dreptunghi=new FormeBidimensionale();
	FormeBidimensionale plansa=new FormeBidimensionale();
	
	public void Afisare() {
		plansa.afisareForma();
	}
	
	public void Modificare() {
	  System.out.println("Modificare");
	}
	
	public void Adaugare() {
		System.out.println("Introduceti figura geometrica: ");
		String s=inp.next();
		if(s.equals("Patrat")) {
			System.out.println("Introduceti latimea si lungimea");
			int lat=inp.nextInt();
			int lun=inp.nextInt();
			Patrat p1=new Patrat(lat, lun);
			patrat.addFigura(p1);
			
		}
		else {
			System.out.println("Introduceti latimea si lungimea: ");
			int lat=inp.nextInt();
			int lun=inp.nextInt();
			Dreptunghi d1=new Dreptunghi(lat,lun);
			dreptunghi.addFigura(d1);
		}
		
		System.out.println("Vreti sa adaugati setul de figuri la plansa ?");
		String option=inp.next();
		if(option.equals("Da")) {
			plansa.addFigura(patrat);
			plansa.addFigura(dreptunghi);
			
		}
	}
	
	public void Stergere() {
		System.out.println("Selectati formele geometrice  pe care vreti sa le stergeti: ");
		String forme=inp.next();
		if(forme.equals("Patrat")){
		plansa.removeFigura(patrat);
		}
		
		else plansa.removeFigura(dreptunghi);
		
	}
	
	public void ArataOptiuni() {
	 	System.out.println("");
		System.out.println("1.exit");
	   	System.out.println("2.adaugare");
	   	System.out.println("3.afisare");
	   	System.out.println("4.modificare");
	   	System.out.println("5.stergere");
	   	System.out.println("");
	}
	

}
