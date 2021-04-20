package standardioplugin;

import java.io.FileWriter;
import java.util.Scanner;

import iowithplugins.abstractions.IInputDevice;

public class StdInputDevice implements IInputDevice {

	Scanner consoleScanner = new Scanner(System.in);
	@Override
	public String ReadString() {
		try{
			FileWriter fw=new FileWriter("D://output//output.txt",true);
			fw.close();
		   }
		catch(Exception e) {System.out.println(e);}
		String inp=consoleScanner.nextLine();
		return inp;
		
		
	}

}
