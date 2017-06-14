package one;

import java.util.Random;

public class dice implements Comparable
{
	static int sixCount = 0;
	Random rand = new Random();
	int face;
	int count;
	
	public void roll()
	{
		face = rand.nextInt(6) + 1;
		if(face == 6)
		{
			count++;
			sixCount++;
		}
	}
	
	public int getFace()
	{
		return face;
	}
	
	public int getSixCount()
	{
		return count;
	}


}
