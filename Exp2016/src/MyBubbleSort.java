
public class MyBubbleSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a = {20, 5, -32, 15, 0, 1, 6};
		a = Bubble(a);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
	
	public static int[] Bubble(int[] a)
	{
		int[] bubbled = a;
		int temp;
		
		for(int i = 0; i < a.length; i++)
			for(int j = 1; j < a.length; j++)
			{
				if(bubbled[j-1] > bubbled[j])
				{
					temp = bubbled[j];
					bubbled[j] = bubbled[j-1];
					bubbled[j-1] = temp;
				}
			}
		
		return bubbled;
	}

}
