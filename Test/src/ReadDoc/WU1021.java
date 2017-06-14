package ReadDoc;
import java.util.ArrayList;
import java.util.Scanner;

public class WU1021 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Character> al = new ArrayList<Character>();
		int count = 0;
		
		System.out.println("Enter a sentence: ");
		String words = input.nextLine();
		
		while(count < words.length())
		{
			al.add(words.charAt(count));
			count++;
		}
		count = 0;
		
		while(count < words.length())
		{
			System.out.println(al.get(count));
			count++;
			Thread.sleep(200);
		}

	}

}
