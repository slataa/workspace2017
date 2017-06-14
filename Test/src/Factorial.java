import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		int val = 0;
		Scanner input = new Scanner(System.in);
		count = input.nextInt();
		val = count;
		
		while(count > 1)
		{
			val = val *(count-1);
			System.out.println(val);
			count--;
		}
		

	}

}
