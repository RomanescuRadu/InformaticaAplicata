package laborator4;

import java.io.FileWriter;
import java.util.Scanner;  

public class Main {  
    public static void main(String args[]){    
         try{    
           Scanner inp=new Scanner(System.in);
        	 FileWriter fw=new FileWriter("C://Users//Radu//eclipse-workspace//Laborator4//testout.txt");    
           String s="";
           while(s.equals("end")!=true){
        	   s=inp.nextLine();
               if(s.equals("end")!=true)
        	        fw.write(s+"\n");  
           }
           inp.close();   
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          
         System.out.println("\nScrierea fisierului s-a terminat cu succes.");    
         
     }    
}  