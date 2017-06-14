import java.util.Random;

public class Shuffle {

    static int[] shuffle(int[] array) 
    {
    	Random r = new Random();
    	
    	for (int i = 0; i < array.length; i++) 
    	{
    		int random = r.nextInt(array.length);
    		// Swap the random element with the present element.
    		int randomElement = array[random];
    		array[random] = array[i];
    		array[i] = randomElement;
    	}
    	return array;
    }

    public static void main(String[] args) 
    {

    	int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 };
    	// Shuffle integer array.
    	values = shuffle(values);

    	// Display elements in array.
    	for (int value : values) 
    	{
    		System.out.println(value);
    	}
    }
}