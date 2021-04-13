import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int option=-1;
	    MenuOptions student=new MenuOptions();
	    
	    Afisare afisare=new Afisare(student);
	    Adaugare adaugare=new Adaugare(student);
	    Modificare modificare=new Modificare(student);
	    Stergere stergere=new Stergere(student);
	    ArataOptiuni arataOptiuni=new ArataOptiuni(student);
	    
	    Menu menu=new Menu();
		
       
		while(option!=1)
		{
			menu.takeCommand(arataOptiuni);
			menu.placeCommand(); 
			option=inp.nextInt();
			switch(option) {
			
			case 2:
				menu.takeCommand(adaugare);
				menu.placeCommand();
				break;
			case 3:
				menu.takeCommand(afisare);
				menu.placeCommand();
				break;
			case 4:
				menu.takeCommand(modificare);
				menu.placeCommand();
				break;
			case 5:
				menu.takeCommand(stergere);
				menu.placeCommand();
				break;
			}
			
							
		}
		
		
		
		
	}

}
