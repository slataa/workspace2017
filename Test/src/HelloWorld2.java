import java.util.Scanner;//always there if you want the person to type

public class HelloWorld2 //always there
{

	public static void main(String[] args) //always there
	{
		Scanner input = new Scanner(System.in);//always there if you want the person to type
		
		//Ask user for a number
		System.out.println("Please enter a number: ");
		
		//Double the number
		int number = input.nextInt();//typing in a number
		
		//Print out the number
		System.out.printf("The number doubled is "+number*2);

	}

}
