
public class Checkerboard 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int counter1 = 1;
		int counter2 = 1;
		while(counter2 <=8)
		{
			if(counter2 %2 == 0)
				System.out.print(" ");
			while(counter1 <= 8)
			{
				System.out.print("* ");
				counter1++;
			}
			counter1 = 1;
			counter2++;
			System.out.println();
		}

	}

}
