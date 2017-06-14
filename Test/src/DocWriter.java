import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocWriter 
{

	public static void main(String[] args) throws IOException 
	{
		String filename;
		double base;
		double logval;
		double exp;
		int count = 0;
		String repeat = "yes";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the name of the file you'd like to create: ");
		filename = input.nextLine();
		
		File outFile = new File (filename+".txt");
		
	    FileWriter fWriter = new FileWriter (outFile);
	    
	    PrintWriter pWriter = new PrintWriter (fWriter);
	    while(repeat.equals("yes"))
	    {
	    	System.out.print("\nPlease enter the base you'd like to calculate: ");
	    	base = input.nextDouble();
	    	System.out.print("Enter the maximum log value you'd like: ");
	    	logval = input.nextDouble();
	    	
	    	
	    	//User Input values below
	    	/*
	    	System.out.print("\nPlease enter the base: ");
	    	base = input.nextDouble();
	    	System.out.print("\nPlease enter the log value: ");
	    	logval = input.nextDouble();
	    	*/
	    	while(count <= logval)
	    	{
	    		exp = Math.log10(count)/Math.log10(base);
	  
	    		pWriter.println ("Base is: "+base);
	    		pWriter.println("Exponent is: "+ exp);
	    		pWriter.println ("Log Value is : " +count);
	    		pWriter.println("");
	    		count++;
	    	}
	    	System.out.print("\nDone!");
	    	System.out.print("\nEnter another? (yes/no)");
	    	repeat = input.next();
	    	count = 0;
	    }
	    pWriter.close();

	}

}
