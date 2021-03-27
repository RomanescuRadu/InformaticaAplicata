import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private Scanner inp = new Scanner(System.in);
	private ArrayList<Student> studenti = new ArrayList<Student>();
   
	public void Run() {
	   int condition=0;
	   int count=-1;
	   while(condition==0) {
		   System.out.println("");
		   System.out.println("1.Iesire");
		   System.out.println("2.Adaugare");
		   System.out.println("3.Modificare");
		   System.out.println("4.Stergere");
		   System.out.println("5.Vizualizare");
		   int optiune=inp.nextInt();
		   switch(optiune) {
		   case(1):
			   condition=1;
			   break;
		   case(2):
			   Adaugare();
		       count++;
		       break;
		   case(3):
			   Modificare();
		       break;
		   case(4):
			   Stergere();
		       count--;
		       break;
		   case(5):
			   Vizualizare(count);
		       break;
			   
		   }
	   }
	}
	
	public void Adaugare() {
		System.out.println("Scrieti numele studentului si nota: ");
		String nume=inp.next();
		int n=inp.nextInt();
		Student s=new Student(nume,n);
		studenti.add(s);
	}
	
	public void Vizualizare(int count) {
		for(int i=0;i<=count;i++)
			System.out.println(studenti.get(i));
	}
	
	public void Modificare() {
	System.out.println("Alegeti studentul pe care vreti sa il modificati: ");
	int n=inp.nextInt();
	System.out.println("Alegeti noul nume si noua nota: ");
	String s=inp.next();
	int i=inp.nextInt();
	studenti.get(n).setNume(s);
	studenti.get(n).setNota(i);
	
	}
	
	public void Stergere() {
		System.out.println("Alegeti numarul elevului pe care vreti sa il stergeti: ");
		int n=inp.nextInt();
		studenti.remove(n);
	}
	
	
}
