package introToClasses;
import java.util.Scanner;

public class AccountTest 
{

	public static void main(String[] args)
	{
		Account first = new Account(12345, 1000, 3.2);
		Account second = new Account(12346, 2, 5);
		
		System.out.println("First has $"+first.getBalance());
		System.out.println("Second has $"+second.getBalance());
		
		second.setInterest(6.7);
		second.calcInterest(4);
		
		System.out.println("First has $"+first.getBalance());
		System.out.println("Second has $"+second.getBalance());

	}

}
