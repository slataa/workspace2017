public class Fib
{
	public int fib(int n) 
	{
	    if(n <= 1) 
	    {
	        return n;
	    }
	    else 
	    {
	    	System.out.println(fib(n-1) + fib(n-2));
	        return fib(n - 1) + fib(n - 2);
	    }
	}
}




