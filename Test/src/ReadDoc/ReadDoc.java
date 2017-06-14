package ReadDoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadDoc 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
	     int count = 0;

	      Scanner input = new Scanner(new File("src/ReadDoc/TEST 1-1 to 1-6.docx"));
	      System.out.println();
	      System.out.println("Integers found: ");

	      while (input.hasNextInt())
	      {
	         System.out.print(input.nextInt() + "\t");
	         count++;
	         if (count%5 == 0)
	            System.out.println();
	      }

	      System.out.println();
	      System.out.println();
	      System.out.println(count + " total integers found.");
	}

}
