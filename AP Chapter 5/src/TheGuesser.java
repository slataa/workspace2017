
public class TheGuesser 
{
	int lowGuess = 0;
	int prevGuess = 0;
	int highGuess = 10000;
	int guess = 5000;
	int bound = 0;
	int correct;
	
	//will not work if "correct" is lower than 5000 to start
	
	public TheGuesser(int correct)
	{
		this.correct = correct;
		guess = (highGuess + lowGuess)/2;
		
	}
	
	public void setGuess(String response)
	{
		
		if(response.equals("The correct answer is lower."))
		{
			highGuess = guess;

		}
		
		if(response.equals("The correct answer is higher."))
		{
			
			lowGuess = guess;
		}

		guess = (highGuess + lowGuess)/2;
	}
	
	public int getGuess()
	{
		return guess;
	}

}
