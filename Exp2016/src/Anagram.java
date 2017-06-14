import java.util.Scanner;

public class Anagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentence;
		char[] characters;
		int shift;
		
		System.out.println("Please enter a sentence: ");
		sentence = input.nextLine();
		
		System.out.print("Please enter the shift:");
		shift = input.nextInt();
		
		characters = new char[sentence.length()];
		
		for(int i = 0; i < sentence.length(); i++)
			characters[i] = sentence.charAt(i);
		
		for(int i = 0; i < characters.length; i++)
			System.out.println((char)(characters[i]+shift));
		

	}

}
