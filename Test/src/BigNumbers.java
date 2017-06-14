import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers 
{
	public static void main(String args[])
	{
		BigInteger big,big2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number.  A big number: ");
		String a = (input.next());
		big = new BigInteger(a);
		
		System.out.print("\nPlease enter another BIG number: ");
		String b = input.next();
		big2 = new BigInteger(b);
		
		System.out.println("\nThe BIG sum is: "+big.add(big2));
		
	}

}
