package rectangle;

import java.util.Scanner;

import iowithplugins.IShape;

public class Rectangle implements IShape{
	
	private double width;
	private double height;

	Scanner in = new Scanner(System.in);

	@Override
	public void readDetails()
	{
		System.out.println("Introduceti latimea si lungimea  dreptunghiului:");
		System.out.print("\nlatime="); width=in.nextInt();
		System.out.print("\nlungime="); height=in.nextInt();
	}

	@Override
	public void showDetails() {
		System.out.println("Dreptunghi:  latime=" + width + ",  lungime=" + height);
	}

}
