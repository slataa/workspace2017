
//John Fitzpatrick
//11/6/2015
//Plays Black Jack against the computer

import java.util.*;
import java.lang.Thread;
import java.text.NumberFormat;

public class BlackJack
{

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner input = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		
		
		TheHouse house = new TheHouse();
		
		
	
		Random randy = new Random();
		double winnings = 0;
		String answer = "y";
		while(answer.equals("y"))
		{
			double bet = 0;
			answer = "n";
			boolean hit;
			String doubleDown;
			
			
			
			int playerCard = 0;
			int dealerCard = 0;
			boolean hasAce;
			
			int counter = 0;
			int count = 0;
			
			String aceResponse;
			String aceConfirm = "n";
			String hitResponse = "y";
			
			while(answer.equals("n"))
			{
				System.out.print("How much do you want to bet. The minimum bet is 50 dollars, and the\nmaximum bet is 50000.");
				bet = input.nextDouble();
				
				if(bet >= 50 && bet <= 50000)
				{
					System. out.print("You have bet " + fmt.format(bet) + ". Do you wish to confirm (y/n): ");
					answer = input.next();
				}
				else
				{
					System.out.print("You have entered a bet outside of this tables allowance. Try again.\n\n");
					Thread.sleep(1000);
				}
				
			}
			
			//The first turn
			
			
			
			
			
			
			
			
			
			
			while(count < 2) // The dealers card
			{
				
				dealerCard = randy.nextInt(house.getTotalCards()) + 1;
				
		
			
				if(count == 1)
				{
					house.setCard(dealerCard);
				}
					
				else
				{
					house.setCard(dealerCard);
					System.out.print(house.getCardDealt() + " and his hidden hole card.\n\n");
				}
					
				
				
				
				count++;
				
			}	
				
			
			count =0;
			
			
			while(count < 2)//The players Card
			{
				playerCard = randy.nextInt(house.getTotalCards()) + 1;
				//If the player gets an ace
				if(playerCard >= 1 && playerCard <= house.getAce())
				{
					//Continues until the player confirms his value chosen for the ace
					while(aceConfirm.equals("n"))
					{
						
						System.out.print("You were dealt an ace. Would you like to play this as a one or an eleven: ");
						aceResponse = input.next();
						
						
						//Confirming the player wants to go with one//
						if(aceResponse.equals("1") || aceResponse.equals("one"))
						{
							System.out.print("You want to play the ace with a value of one. Do you confirm (y/n)");
							aceConfirm = input.next();
							
							if(aceConfirm.equals("y"))
							{
								house.setPlayerOne();
								
								//Makes sure that neither dealer nor player busted. 
								if(house.getPlayer() <= 21 && house.getDealer() <= 21)
								{
									System.out.println("Ok, you have played the ace as a one");
								}
								
								else
								{
									
								}
							}
						}
						
						else if(aceResponse.equals("11") || aceResponse.equals("eleven"))
						{
							System.out.print("You want to play the ace as an eleven. Do you wish to confirm (y/n): ");
							aceConfirm = input.next();
							if(aceConfirm.equals("y"))
							{
								house.setPlayerEleven();
								
								if(house.getPlayer() <= 21 && house.getDealer() <= 21)
								{
									System.out.println("Ok you have played the ace as an eleven" );
								}
								
								else
								{
									
								}
							}
						}
						
					}
					house.dealtAce();
				
				}
				
				else
				{
					house.setCardPlayer(playerCard);
					System.out.println(house.getPlayerCardDealt() + ". ");
					
				
				}
			count++;
			}
			System.out.print("Would you like to hit (y/n): ");
			answer = input.next();
	
			//All the other turns
			while(house.getPlayer() <= 21 && answer.equals("y"))
			{
				System.out.print("Do you want to double down(y/n)");
				doubleDown = input.next();
				
				if(doubleDown.equals("y"))
				{
					Thread voice = new Thread(new AudioTask());
					Thread words = new Thread(new WordTask() );
					
					voice.start();
					words.start();
					
					bet = bet *2;
					playerCard = randy.nextInt(house.getTotalCards()) + 1;
					
					Thread.sleep(30000);
					System.out.print("\nYour bet is now "  + fmt.format(bet)  + " and you get one more card. Are you ready(y/n): ");
					answer = input.next();
					
					if(answer.equals("y"))
					{
						
						System.out.println("THEN LETS GO BABY!!!!!!!!!!!");
						house.setCardPlayer(playerCard);
						System.out.print("\n" + house.getPlayerCardDealt());
						Thread.sleep(800);
					}
					
					else
					{
						System.out.println("WELL BUCKLE UP BECAUSE HERE COMES THE CARD");
						house.setCardPlayer(playerCard);
						System.out.print(house.getPlayerCardDealt());
						Thread.sleep(800);
					}
					
					System.out.print("Your total is " + house.getPlayer() );
					
					break;
				}
				
				else
				{
					answer = "y";
					
					while(answer.equals("y") && house.getPlayer() < 21)
					{
						playerCard = randy.nextInt(house.getTotalCards()) + 1;
						house.setCardPlayer(playerCard);
						System.out.println("\n" + house.getPlayerCardDealt() + ". Your total is now " + house.getPlayer());
						
						System.out.print("Would you like to hit (y/n): ");
						answer = input.next();
						System.out.println("");
					}
				}
			}
				
				
					System.out.println("");
					System.out.print("Now lets see what the dealer does.\n");
					String dealCard = house.getCardDealt();
					System.out.println("The dealer's hidden hole card was a/an" + dealCard.substring(22, dealCard.length()) );
					
					
					while(house.getDealer()< 17)
					{
						
						
						dealerCard = randy.nextInt(house.getTotalCards()) + 1;
						house.setCard(dealerCard);
						System.out.print(house.getCardDealt());
						if(house.getDealer() < 17)
						{
							System.out.println("\nThe dealer decides to hit.");
						}
					
					}
					
					System.out.println("\nThe dealer decides to stay");
					
					if(house.getPlayer() > 21 && house.getDealer() > 21)
					{
						System.out.print("You busted, but so did the dealer so you get your original bet back");
					}
					else if(house.getPlayer() > 21)
					{
						System.out.print("You busted and lost all your money");
						winnings = winnings - bet;
					}
					
					else if(house.getDealer() > 21)
					{
						System.out.print("Congratulations, the dealer busted and you won back twice your earnings. You now have " + fmt.format(bet * 2));
						winnings = winnings + bet;
					}
					else if(house.getPlayer() == 21 && house.getDealer() != 21)
					{
						System.out.print("You got blackjack and won. You have tripled your bet to" + fmt.format(bet*3) );
						winnings = winnings + bet*2;
					}
					else if(house.getPlayer() > house.getDealer())
					{
						System.out.print("You won and doubled your money. Congratulations. You now have " + fmt.format(bet*2));
						winnings = winnings + bet;
					}
					else if(house.getDealer() > house.getPlayer())
					{
						System.out.print("You lost and now have 0 dollars.");
						winnings = winnings - bet;
					}
					else if(house.getPlayer() == house.getDealer())
					{
						System.out.print("You tied. You neither lost nor gained money");
					}
					else
					{
						System.out.print("I have no idea what you did. Good luck");
					}
					
					System.out.print("\nWould you like to play again (y/n)");
					answer = input.next();
					
					
					
		}
		
		System.out.println("Ok, thanks for playing. Your total winnings were " + fmt.format(winnings));
		if(winnings < 0)
		{
			System.out.print("Can you make that payment? (y/n): ");
			answer = input.next();
			
			if(answer.equals("y"))
			{
				System.out.print("Ok good. Thank you for your businuess");
			}
			else
			{
				System.out.print("Well we'll have to deal with that won't we...");
				Thread.sleep(5000);
				System.out.print("\r                                              ");
				Thread.sleep(1000);
				System.out.print("\rBAM");
				Thread.sleep(250);
				System.out.print("\r   ");
				Thread.sleep(200);
				
				
				Thread.sleep(8000);
				System.out.print("\rYou wake up in a dark alley. Both your legs are broken. Your wallet is missing. \nAs you slip back into unconciousness you wonder how your life got this low...");
				
				
			
			}
		}
		
		
			
	}
			
		
}
	
	


