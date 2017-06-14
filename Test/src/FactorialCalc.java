
public class FactorialCalc 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		displayFactorial();
	}
	
	public static long factorial(long num)
	{
		if(num <=1)
			return 1;
		else return num *factorial(num - 1);
	}
	
	public static void displayFactorial()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.printf("%d! = %d\n", i, factorial(i));
		}
	}

}
