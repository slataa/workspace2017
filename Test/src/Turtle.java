
public class Turtle extends Pennsylvania
{
	//animal specific traits
	int strength;
	
	public Turtle()
	{
		super();
	}
	
	public void setStrength()
	{
		strength = 40;
	}
	
	public String speak()
	{
		return ("ahhr");
	}
	
	public int getStrength()
	{
		setStrength();
		return strength;
	}

}
