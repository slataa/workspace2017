import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		
		System.out.println("Please enter your name: ");
		name = input.next();
		
		System.out.printf("Hello %s!", name);

	}

}
