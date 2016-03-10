/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "king", "queen", "ace"};
		String[] suits = {"diamonds","hearts","clubs","spades"};
		int[] values = {11,13,6,1};
		Deck deck = new Deck(ranks,suits,values);
		System.out.println(deck);
		System.out.println(deck.isEmpty());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.isEmpty());
		
	}
}
