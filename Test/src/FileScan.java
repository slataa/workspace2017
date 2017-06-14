import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

//This class loops through and prints out a files contents to the console

public class FileScan 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		Scanner fileScan = new Scanner(new File("test.txt"));
		Scanner reScan;
		String output;
		int counter = 0;
		
		while(fileScan.hasNext())
		{
			counter++;
			output = fileScan.next().toUpperCase();
		
			System.out.print(output + " ");
		}
		System.out.println("\nWord total: "+counter);
	

	}
	

}
