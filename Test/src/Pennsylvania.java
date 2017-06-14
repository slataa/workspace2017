import java.util.ArrayList;

public class Pennsylvania extends Land
{
	//biome level traits
	ArrayList<World> list = new ArrayList<World>();
	
	public Pennsylvania()
	{
		//System.out.println("PA!");
		
	}
	
	//must include this method
	public void addAnimals()
	{
		for(int i = 0; i<10;i++)
		list.add(new Bunny());
		list.add(new Turtle());
	}
	//must include this method
	public ArrayList<World> getList()
	{
		return list;
	}
	
}
