package one;

import java.util.ArrayList;

public class RollEm {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		dice di3 = new dice();
		dice di1 = new dice();
		dice di2 = new dice();
		dice di4 = new dice();
		dice di5 = new dice();
		
		ArrayList<dice> a = new ArrayList<dice>();
		a.add(di1);
		a.add(di2);
		a.add(di3);
		a.add(di4);
		a.add(di5);
		for(int i = 5; i > 0; i--)
			for(dice di : a)
				di.roll();
		System.out.println("Dice 1: " +di1.getSixCount());
		System.out.println("Dice 2: " +di2.getSixCount());
		System.out.println("Dice 3: " +di3.getSixCount());
		System.out.println("Dice 4: " +di4.getSixCount());
		System.out.println("Dice 5: " +di5.getSixCount());
		System.out.println("Six rolled " +dice.sixCount+" times.");

	}

}
