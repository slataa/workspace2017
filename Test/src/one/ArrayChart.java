package one;

public class ArrayChart {

	public static void main(String[] args) 
	{
		Sorting sort = new Sorting();
		
		//array to be altered
		int[] test = {1,2,3,4,5,7};
		//value to be added to the array
		int addition = 6;
		//method call to set the original equal to the altered version
		test = list(test, addition);
		//printing out results
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i]);
/////////////////////////////////////////////////Sorting/////////////////////////////
		System.out.println();
		sort.BubbleSort(test);
		for(int a : test)
			System.out.print(a);
		System.out.println();
		sort.InsertionSort(test);
		for(int a : test)
			System.out.print(a);
/////////////////////////////////////////////////////////////////////////////////////
	}
	//requires the previous array and the new value to be added
	public static int[] list(int[] temp, int num)
	{
		//new array is created with a length one greater than original
		int[] array = new int[temp.length + 1];
		//copies all values from original to new array
		for(int j = 0;j <= temp.length; j++)
		{
			//when we reach the end of the array, we add the new value and stop copying
			if(j == temp.length)
			{
				array[j] = num;
			}
			else
				array[j]=temp[j];
		}
		//the entire new array is returned
		return array;
	}

}
