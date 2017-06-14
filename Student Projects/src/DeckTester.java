public class DeckTester
{
    public static void main(String args[])
    {
 
        Deck deck = new Deck();
 
        int[] p1;
        int[] p2;
        
        int[] variableDeck = deck.deck();
        
        deck.shuffle();
        deck.deal();

        p1 = deck.getP1();
        p2 = deck.getP2();
        
        for( int value = 0; value < p1.length; value++)
            System.out.println("Tester Player1: "+p1[value]);
        for( int value = 0; value < p2.length; value++)
        	System.out.println("Tester Player 2:"+p2[value]);
        
        
        
        
    }
}