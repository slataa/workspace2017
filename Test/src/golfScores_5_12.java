import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class golfScores_5_12 {

	public static void main(String[] args) throws IOException
	{
		String golfScores;
		Scanner fileScan;
		int line = 0;
		
		fileScan = new Scanner(new File("src/golf scores.txt"));
		
		ArrayList<Integer> All = new ArrayList<Integer>();
		ArrayList<Integer> Totals = new ArrayList<Integer>();
		int count = 0;
		int index = 0;
		
		while(count < 5)
		{
			Totals.add(count, 0);
			count++;
		}
		
		while(fileScan.hasNext())
		{
			line = fileScan.nextInt();
			All.add(line);
			
		}
		
		System.out.println(All);
		Collections.sort(All);
		System.out.println(All);
		
		for(int i:All)
			System.out.println(i);
		
		
		/*while(count < All.size())
		{
			if((2*index) % 5 == 0 )
			{
				Totals.set(index, Totals.get(index)+All.get(index));
			}
			count++;
			index++;
		}*/
		
		//System.out.print(Totals);
		
		
		
	}
	


}
