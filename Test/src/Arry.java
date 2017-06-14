import java.util.Random;

public class Arry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array1 = new int[5];
		Random rand = new Random();
		
		for(int i = 0; i < array1.length; i++)
		{
			array1[i] = rand.nextInt(100);
		}

		for(int j = 0; j < array1.length; j++)
		{
			System.out.println(array1[j]);
		}
	}

}
