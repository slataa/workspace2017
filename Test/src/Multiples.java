import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Please enter the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Please enter the second number: ");
		num2 = input.nextInt();
		
		if(num2 != 0)
		{
			if(num1%num2 == 0)
			{
				System.out.printf("\n%d is a multiple of %d", num1, num2);
			}
		
			if(num1%num2 !=0)
			{
				System.out.printf("\n%d is not a multiple of %d", num1, num2);
			}
		}
		
		if(num1 == 0 && num2 == 0)
		{
			System.out.println("They are multiples of each other");
		}
		
		if(num2 == 0)
		{
			System.out.println("Cannot divide by zero");
		}
		
		

	}

}
