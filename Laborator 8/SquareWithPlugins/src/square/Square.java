package square;
import java.util.Scanner;

import iowithplugins.IShape;

public class Square implements IShape {
     private int latura;
     Scanner inp=new Scanner(System.in);
     @Override
 	public void readDetails()
 	{
 		System.out.println("Introduceti lungimile laturii patratului:");
 		latura=inp.nextInt();
 		System.out.println(latura);
 	}

 	@Override
 	public void showDetails() {
 		System.out.println("Patrat:    latura=" + latura);
 	}
}
