package one;

public class Sorting {


	
	public static void BubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	} 

	public static void InsertionSort( int [ ] num)
	{
	     int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  

	     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
	    {
	           key = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = key;    // Put the key in its proper location
	         
	     }
	}
}
