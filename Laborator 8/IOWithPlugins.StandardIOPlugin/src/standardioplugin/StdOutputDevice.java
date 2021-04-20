package standardioplugin;

import java.io.File;
import java.io.FileWriter;

import java.util.Scanner;

import iowithplugins.abstractions.IOutputDevice;

public class StdOutputDevice implements IOutputDevice  {

	@Override
	public void WriteString(String s) {
		try{
			FileWriter fw=new FileWriter("D://output//output.txt",true);
			fw.write(s);
			fw.close();
			File file=new File("D://output//output.txt");
			Scanner output=new Scanner(file);
			
			while(output.hasNextLine())
				System.out.println(output.nextLine());
			
			output.close();
		   }
		catch(Exception e) {System.out.println(e);};
		
		
		

	}

}
