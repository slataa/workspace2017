package Reena;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	   String[] ranks = {"a", "b", "c", "d"};
	   String[] suits = {"redcoats", "bluecoats"};
	   int[] points = {1, 2, 3, 4};
	   Deck one = new Deck(ranks, suits, points);
	}
}