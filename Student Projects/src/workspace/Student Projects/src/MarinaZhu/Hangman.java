package MarinaZhu;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Hangman 
{	
	public String getWord() throws IOException
	{
	    Random randomGenerator = new Random();
		
		Scanner wordscan = new Scanner(new File("Words"));
		String[] wordlist = new String[50];//Shelley he told us to use Arrays
		while (wordscan.hasNextLine())
		{
		    for(int index = 0; index < wordlist.length; index++)
		    	wordlist[index] = wordscan.nextLine();
		}
		
        int index = randomGenerator.nextInt(wordlist.length);
        String word = wordlist[index];




        return word;
	}
	
	public void draw(HangmanState state)
	{		
		
		System.out.println("You have failed "+state.howManyTimeYouFailedToGuessACorrectLetter+" times"); //use the amount of failed times variable to draw the amount of body parts hangman has
		
	}




	public void calculateTheAmountOfFailedGuesses(HangmanState state)
	{
		
		/*ArrayList<Character> lettersInWord = new ArrayList<Character>();
		for (int index = 0; index < state.theCurrentWord.length(); index++)
		{
			Character letter = state.theCurrentWord.charAt(index);
			
			if(letter.equals(state.inputLetter))
			{
				state.index = index + 1;
			}
			lettersInWord.add(letter);
		}*/




		if (state.theCurrentWord.indexOf(state.inputLetter) == -1)
		{
			state.howManyTimeYouFailedToGuessACorrectLetter++;
			System.out.println("Incorrect guess");
		}
		else
		{
			
			System.out.println("Your guess was correct");
			
			ArrayList<String> lettersInWord = new ArrayList<String>();
			for (int index = 0; index < state.theCurrentWord.length(); index++)
			{
				Character letter_char = state.theCurrentWord.charAt(index);
				String letter = Character.toString(letter_char);
				lettersInWord.add(letter);
			}
			
			for(int index = 0; index < lettersInWord.size(); index++)
			{
				if (lettersInWord.get(index).equals(state.getInputLetter()))
				{
					
					state.line = index +1;
					System.out.println("*place "+state.inputLetter+" on line number "+state.line+"*");
				}
			}
			state.numCorrectGuesses++;
		
		}	
		
		/*if (state.lettersInWord.contains(state.getInputLetter()))
		{
		
		}
		else
			state.howManyTimeYouFailedToGuessACorrectLetter++;
		
	    for(int count = 0; count < lettersInWord.size(); count++)
		{
			if(!state.inputLetter.equals(lettersInWord.get(count)))
			{
				state.howManyTimeYouFailedToGuessACorrectLetter++;
			}
		}
		
		/* while (state.theCurrentWord.hasNext())
		{
			state.lettersInWord.add(state.theCurrentWord.next());
		}
		*/
	}
	
	public void getLetter(HangmanState state)
	{
		String letter = ""; //input letter
		Scanner input = new Scanner(System.in);
		int x = 1;
	
		System.out.println("This word is " + state.theCurrentWord.length() + " letters long!");
		
		while(state.done() == false && state.done == false)
		{
			x = 0;
		
			System.out.println("What letter do you choose?");


			letter = input.next();
			state.inputLetter = letter;	
			
			if (!state.chosenLetters.contains(letter))
				break;
			
				
			System.out.println("You already chose that, choose another!");


			if (state.numCorrectGuesses == state.theCurrentWord.length())
			{
				state.done = true;
			}
			/*
			for(int count = 0; count < state.chosenLetters.size(); count++)
			{
				if(letter.equals(state.chosenLetters.get(count)))
				{
					x++;
				}
			}
			if(x < 1)
				System.out.println("You chose "+letter);
			else
				System.out.println("You already chose that, choose another!");
			*/
		}
		
		System.out.println("You chose "+letter);
		state.chosenLetters.add(letter);
		
		System.out.println("You have chosen "+state.chosenLetters+"");


	}
	
	
	public void play() throws IOException
	{
		// HangmanDrawer drawer = new HangmanDrawer();
		
		HangmanState state = new HangmanState();
		state.theCurrentWord = getWord();
		
		while (!state.done() && state.done == false)
		{
			getLetter(state);
			calculateTheAmountOfFailedGuesses(state);
			draw(state);
			
			if (state.numCorrectGuesses == state.theCurrentWord.length())
			{
				System.out.println("You won! Yay!");
				state.done(0);
			}
			else if (state.done() == true)
			{
				System.out.println("You lost!");
				System.out.println("The word was: " + state.theCurrentWord);	
			}
		}
		
		
		/*if (state.numCorrectGuesses == state.theCurrentWord.length())
			System.out.println("You won!");
		else
		{
			System.out.println("You lost!");
			System.out.println("The word was: " + state.theCurrentWord);
		}8*/
		
		
			// drawer.DrawHangman(state);
		
			// drawer.GetLetter();
		
			// DrawHangman(state);
			
			// GetLetter(state)




			// DrawLetters(state)
		
			// Resolve(state)
		
			// if (state.won)
		
				// DrawSuccess();
		
			// else
		
				// DrawDead();
		
		// DrawThanks();
	}
}


import java.util.ArrayList;


public class HangmanState 
{
	
	public int howManyTimeYouFailedToGuessACorrectLetter;
	public int numCorrectGuesses;
	public String theCurrentWord;
	//public String chosenLetters;
	public ArrayList<String> chosenLetters = new ArrayList<String>();
	public boolean wonOrLost;
	public String inputLetter;	
	
	public boolean done = false;
	public String getInputLetter()
	{
		return inputLetter;
	}
	public boolean done()
	{
		if (howManyTimeYouFailedToGuessACorrectLetter < 7 )
			return false;
		else
			return true;
	}
	
	public void done(int a)
	{
		if (a == 0)
			done = true;
		else
			done = false;
	}


	int line;
	
}


import java.util.Scanner;


import java.io.*;


public class Game 
{
	public static void main(String[] args) throws IOException
	{
		Hangman hangman = new Hangman();
		hangman.play();
		
	}
}






