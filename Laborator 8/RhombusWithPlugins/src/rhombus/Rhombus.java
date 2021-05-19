package rhombus;

import java.util.Scanner;

import iowithplugins.IShape;

public class Rhombus implements IShape{
	
	int latura;
	Scanner inp=new Scanner(System.in);
	
	@Override
	public void readDetails()
	{
		System.out.println("Introduceti lungimea laturii rombului:");
		System.out.println("latura= ");
		latura=inp.nextInt();
		
	   
	}

	@Override
	public void showDetails() {
		System.out.println("Romb: latura= "+latura);
	}

}
