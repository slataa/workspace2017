import java.util.ArrayList;
import java.util.Random;

public class AnimalTest {

	//main class
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<World> list = new ArrayList<World>();
		
		
		Pennsylvania biome = new Pennsylvania();
		
		biome.addAnimals();
		
		list.addAll(biome.getList());
		Random rand = new Random();
		System.out.println(list.get(2).speak());
		System.out.println(list.get(10).getStrength());
		list.get(4).g
		
		
	}

}
