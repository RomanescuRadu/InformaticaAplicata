package triangle;

import java.util.Scanner;

import iowithplugins.IShape;

public class Triangle implements IShape{
	
	private double l1;
	private double l2;
	private double l3;


	Scanner in = new Scanner(System.in);

	@Override
	public void readDetails()
	{
		System.out.println("Introduceti lungimile laturilor triunghiului:");
		System.out.print("\nl1="); l1=in.nextInt();
		System.out.print("\nl2="); l2=in.nextInt();
		System.out.print("\nl3="); l3=in.nextInt();
	}

	@Override
	public void showDetails() {
		System.out.println("Triunghi:    l1=" + l1 + ",     l2=" + l2 + ",   l3=" + l3);
	}

}
