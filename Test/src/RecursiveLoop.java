
public class RecursiveLoop 
{
	public static void main(String args[])
	{
		loop(10);
	}

	public static void loop(int i)
	{
		System.out.print(i-1);
		if(i >= 2)
		loop(i-1);
		//return i-1;
		
	}
}
