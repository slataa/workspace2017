import java.util.Scanner;

public class Factoring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int ac;
		int count = 1;
		int afactor1, afactor2;
		int cfactor1, cfactor2;
		int x1, x2;
		int check;
		
		System.out.print("Please enter A: ");
		a = input.nextInt();
		System.out.print("\nPlease enter B: ");
		b = input.nextInt();
		System.out.print("\nPlease enter C: ");
		c = input.nextInt();
		
		x1 = (int)(-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		x2 = (int)(-1*b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		
		System.out.print("\n"+x1+" "+x2);

	}

}
