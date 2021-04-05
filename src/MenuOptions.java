import java.util.Scanner;

public class MenuOptions {
private Command afisareCommand;
private Command adaugareCommand;
private Command modificareCommand;
private Command stergereCommand;
Scanner inp=new Scanner(System.in);

public MenuOptions(Command afisare , Command adaugare , Command modificare , Command stergere) {
	this.afisareCommand=afisare;
	this.adaugareCommand=adaugare;
	this.modificareCommand=modificare;
	this.stergereCommand=stergere;
};

public void run() {
   	System.out.println("1.exit");
   	System.out.println("2.adaugare");
   	System.out.println("3.afisare");
   	System.out.println("4.modificare");
   	System.out.println("5.stergere");
   	
}


public void afisare() {
	afisareCommand.execute();
}

public void adaugare() {
	adaugareCommand.execute();
}

public void modificare() {
	modificareCommand.execute();
}

public void stergere() {
	stergereCommand.execute();
}




}
