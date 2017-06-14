import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest 
{
	static ArrayList<Integer> list = new ArrayList();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++)
		{
			inputVals();
		}
		
		list.remove(6);
		System.out.println(list);
	

	}

	public static void inputVals()
	{
		System.out.println("Please enter an integer:");
		list.add(input.nextInt());
	}
	
}
