import java.util.Scanner;

public class Time {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a time in seconds: ");
		int time = input.nextInt();
		
		int hours = time/3600;
		int min = time%3600/60;
		int sec = time%3600%60;
		
		System.out.println(hours + " hours " + min +" minutes "+" and "+ sec +" seconds");
		String name = "ok";
		
		

	}

}
