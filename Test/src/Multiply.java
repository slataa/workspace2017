import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the biggest multiplier: ");
		int end = input.nextInt();
		/*
		do{
			System.out.println(end);
			end--;
		}while(end > 0);
		String word = "gogurt";
		for(int j = word.length(); j > 0; j-- )
			System.out.print(word.charAt(j-1));*/
		for(int j = 0; j < 5; j ++)
		{
			for(int k = 0 ; k < 5;k ++)
				if(j !=k)
					System.out.print(' ');
				else
					System.out.print('*');
					System.out.println();

		}
		/*
		// TODO Auto-generated method stub
		for(int i = 1; i <= end; i++)
		{
			for(int j = 1; j <= end; j++)
			{
				System.out.print(j*i+"\t");
			}
			System.out.println();
		}
		*/
	}

}
