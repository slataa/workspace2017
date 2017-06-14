import java.util.ArrayList;
import java.util.Random;

public class Land extends World
{
	//land properties
	Random rand = new Random();
	int strength;
	int speed2;
	ArrayList<Land> landList = new ArrayList<Land>();
	
	public Land()
	{
		//System.out.println("Land!");
		
	}
	
	public int getStrength()
	{
		return strength;
	}
	//land methods
	
	public ArrayList<World> getList()
	{
		return landList;
	}
	
}
