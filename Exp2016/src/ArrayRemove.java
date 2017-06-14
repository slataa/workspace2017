import java.util.Scanner;

public class ArrayRemove 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[]a = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i < a.length; i++)
			a[i] = i;
		
		
		
		System.out.print("What index do you want to replace?");
		int replace = input.nextInt();
		
		a = replace(replace,a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");

	}

	public static int[] replace(int index, int[] b)
	{
		b[index] = 0;
		for(int i = index; i < b.length-1; i++)
		{
			b[i]=b[i+1];
		}
		b[b.length-1] = 0;
		return b;
	}
}
