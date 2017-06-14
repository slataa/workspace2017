
//John Fitzpatrick
//
public class TheHouse

{
	
	
	
	int ace = 16;
	int two = 16;
	int three = 16;
	int four = 16;
	int five = 16;
	int six = 16;
	int seven = 16;
	int eight = 16;
	int nine = 16;
	int ten = 16;
	int jack = 16;
	int queen = 16;
	int king = 16;
	

	String playerCardDealt;
	String cardDealt;
	
	int dealer = 0;
	int player = 0;
	
	int totalCards = 208;
	
	
	public void setCard(int dealerCard)
	{
		
		
			if(dealerCard >=1 && dealerCard <= ace)//He was dealt an ace
			{
				
				if(dealer <= 10)
				{
					dealer = dealer + 11;
					ace = ace -1;
					cardDealt = "The dealer was dealt an ace and e decides to play it as a value of 11";
				}
				else
				{
					ace = ace -1;
					dealer = dealer+1;
					cardDealt = "The dealer was dealt an ace and he decides to play it as a value of one";
				}
			}
			
			else if(dealerCard >ace && dealerCard <= (two + ace))
			{
				cardDealt = "The dealer was dealt a two";
				dealer = dealer + 2;
				two = two -1;
			}
			
			else if(dealerCard >(two + ace) && dealerCard <= (three+ two + ace))
			{
				cardDealt = "The dealer was dealt a three";
				dealer = dealer + 3;
				three = three -1;
			}
			
			else if(dealerCard >(three+ two + ace) && dealerCard <= (four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a four";
				dealer = dealer + 4;
				four = four -1;
			}
			
			else if(dealerCard >(four + three + two + ace) && dealerCard <= (five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a five";
				dealer = dealer + 5;
				five -= 1;
			}
			
			else if(dealerCard >(five +four + three + two + ace) && dealerCard <= (six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a six";
				dealer = dealer + 6;
				six -= 1;
			}
			
			else if(dealerCard >(six +five +four + three + two + ace) && dealerCard <= (seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a seven";
				dealer = dealer + 7;
				seven -= 1;
			}
			
			else if(dealerCard >(seven + six +five +four + three + two + ace) && dealerCard <= ( eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a eight";
				dealer = dealer + 8;
				eight -= 1;
			}
			
			else if(dealerCard >( eight + seven + six +five +four + three + two + ace) && dealerCard <= (nine + eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a nine";
				dealer = dealer + 9;
				nine -= 1;
			}
			
			else if(dealerCard > (nine + eight + seven + six +five +four + three + two + ace) && dealerCard <= (ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a ten";
				dealer = dealer + 10;
				ten -= 1;
			}
			
			else if(dealerCard >(ten + nine + eight + seven + six +five +four + three + two + ace) && dealerCard <= (jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a jack";
				dealer = dealer + 10;
				jack -= 1;
			}
			
			else if(dealerCard >(jack +ten + nine + eight + seven + six +five +four + three + two + ace) && dealerCard <= (queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a queen";
				dealer = dealer + 10;
				queen -= 1;
			}
			
			else if(dealerCard >(queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace) && dealerCard <= (king +queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				cardDealt = "The dealer was dealt a king";
				dealer = dealer + 10;
				king -= 1;
			}
	}
	
	public void setCardPlayer(int playerCard)
	{
		
		
			
			
			if(playerCard >ace && playerCard <= (two + ace))
			{
				playerCardDealt = "You were dealt a two";
				player = player + 2;
				two = two -1;
			}
			
			else if(playerCard >(two + ace) && playerCard <= (three+ two + ace))
			{
				playerCardDealt = "You were dealt a three";
				player += 3;
				three = three -1;
			}
			
			else if(playerCard >(three+ two + ace) && playerCard <= (four + three + two + ace))
			{
				playerCardDealt = "You were dealt a four";
				player += 4;
				four = four -1;
			}
			
			else if(playerCard >(four + three + two + ace) && playerCard <= (five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a five";
				player += 5;
				five -= 1;
			}
			
			else if(playerCard >(five +four + three + two + ace) && playerCard <= (six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a six";
				player += 6;
				six -= 1;
			}
			
			else if(playerCard >(six +five +four + three + two + ace) && playerCard <= (seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a seven";
				player += 7;
				seven -= 1;
			}
			
			else if(playerCard >(seven + six +five +four + three + two + ace) && playerCard <= ( eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a eight";
				player += 8;
				eight -= 1;
			}
			
			else if(playerCard >( eight + seven + six +five +four + three + two + ace) && playerCard <= (nine + eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a nine";
				player += 9;
				nine -= 1;
			}
			
			else if(playerCard > (nine + eight + seven + six +five +four + three + two + ace) && playerCard <= (ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a ten";
				player += 10;
				ten -= 1;
			}
			
			else if(playerCard >(ten + nine + eight + seven + six +five +four + three + two + ace) && playerCard <= (jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a jack";
				player += 10;
				jack -= 1;
			}
			
			else if(playerCard >(jack +ten + nine + eight + seven + six +five +four + three + two + ace) && playerCard <= (queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a queen";
				player += 10;
				queen -= 1;
			}
			
			else if(playerCard >(queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace) && playerCard <= (king +queen +jack +ten + nine + eight + seven + six +five +four + three + two + ace))
			{
				playerCardDealt = "You were dealt a king";
				player += 10;
				king -= 1;
			}
	}
	

	
	public int getTotalCards()
	{
		totalCards = (ace + two + three + four + five + six + seven + eight + nine + ten + jack + queen + king);
		return totalCards;
	}
	
	public String getCardDealt()
	{
		return cardDealt;
	}
	
	public String getPlayerCardDealt()
	{
		return playerCardDealt;
	}
	
	public int getDealer()
	{
		return dealer;
	}
	
	public int getAce()
	{
		return ace;
	}
	
	public void setPlayerOne()
	{
		player = player + 1;
	}
	
	public void setPlayerEleven()
	{
		player = player + 11;
	}
	
	public void dealtAce()
	{
		ace = ace - 1;
	}
	
	
	public int getPlayer()
	{
		return player;
	}
	
}
