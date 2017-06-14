import java.io.IOException;
import java.util.Scanner;

public class Lines
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		Runtime.getRuntime().exec("/bin/bash -c Terminal");
		AudioPlayer play = new AudioPlayer();
		BrennanSing sing = new BrennanSing();
		Scanner input = new Scanner(System.in);
		
		
		String path = "/Users/slataa/Google Drive/workspace/Christmas/src/";
		
		for(int i = 1; i <=12; i++)
		{
			System.out.println("");
			
			sing.boy(i);
			
			switch(i)
			{
			case 12:
				System.out.println("Twelve Drummers Drumming");
				play.play(path+"Day 12.WAV");
			case 11:
				System.out.println("Eleven Pipers Piping");
				play.play(path+"Day 11.WAV");
			case 10:
				System.out.println("Ten Lords a Leaping");
				play.play(path+"Day 10.WAV");
			case 9:
				System.out.println("Nine Ladies Dancing");
				play.play(path+"Day 9.WAV");
			case 8:
				System.out.println("Eight Maids-a-Milking");
				play.play(path+"Day 8.WAV");
				
			case 7:
				System.out.println("Seven Swans a-Swimming");
				play.play(path+"Day 7.WAV");
				
			case 6:
				System.out.println("Six Gees-a-Laying");
				play.play(path+"Day 6.WAV");
				
			case 5:
				System.out.println("FIIIIVE GOLLDEEN RINGSSS");
				play.play(path+"Day 5.WAV");
			case 4:
				System.out.println("Four Calling Birds");
				play.play(path+"Day 4.WAV");
			case 3:
				System.out.println("Three French Hens");
				play.play(path+"Day 3.WAV");
			case 2:
				System.out.println("Two turtle doves, and");
				play.play(path+"Day 2.WAV");
			case 1:
				System.out.println("A partridge in a pear tree.");
				play.play(path+"First Day.wav");
				Thread.sleep(1000);
			}
		}

	}

}