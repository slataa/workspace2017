
import java.io.*;

public class WordTask implements Runnable
{
	public void run()
	{
		int baby= 0;
		System.out.println("");
		
		while(baby < 5)
		{
			System.out.print("D\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print(" O\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("  U\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("   B\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("    L\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("     E\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("      D\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("       O\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("        W\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("         N\r");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("           \r");
			baby++;
		}
		baby =0;
		while(baby< 50)
		{
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("\rDOUBLEDOWN");
			try 
			{
				Thread.sleep(150);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			System.out.print("\r          ");
			
			baby++;
		}
	}

}
	

