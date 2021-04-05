import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		int option=-1;
		StudentOptions stdop=new StudentOptions();
		Command afisare=new Afisare(stdop);
		Command adaugare=new Adaugare(stdop);
		Command stergere=new Stergere(stdop);
		Command modificare=new Modificare(stdop);
		
		MenuOptions menu=new MenuOptions(afisare,adaugare,modificare,stergere);
		while(option!=1)
		{
			menu.run();
			option=inp.nextInt();
			switch(option) {
			case 2:
				menu.adaugare();
				break;
			case 3:
				menu.afisare();
				break;
			case 4:
				menu.modificare();
				break;
			case 5:
				menu.stergere();
				break;
			}
							
		}
		
		
		
		
	}

}
