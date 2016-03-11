/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suit = {"clubs", "jacks", "hearts", "diamonds"};
		int[] pointValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		Deck dilby = new Deck(rank, suit, pointValue);
		dilby.shuffle();
		System.out.println(dilby.toString());
		dilby.shuffle();
		System.out.println(dilby.toString());
		for(int i = 0; i < 13; i++)
			dilby.deal();
		dilby.shuffle();
		System.out.println(dilby.toString());
	}
}
