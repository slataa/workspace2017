
public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int lines = 1; lines <= 3; lines++)
		{
			for(int spaces = 1; spaces <= lines; spaces++)
			{
				System.out.print("*");
			}
			for(int stars = 1; stars < (2* lines)-1; stars++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
