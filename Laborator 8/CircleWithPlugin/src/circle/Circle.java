package circle;

import java.util.Scanner;

import iowithplugins.IShape;

public class Circle implements IShape {
	
	private double raza;

	
	Scanner in = new Scanner(System.in);

	@Override
	public void readDetails()
	{
		System.out.println("Introduceti raza cercului:");
		System.out.print("\nRaza="); raza=in.nextInt();
	}

	@Override
	public void showDetails() 
	{
		System.out.println("Cerc:        raza=" + raza);
	}

}
