/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] suit = new String[4];
		suit[0] = "Heart";
		suit[1] = "Diamond";
		suit[2] = "Clubs";
		suit[3] = "Spades";

		String[] rank = new String[13];
		rank[0] = "Ace";
		rank[1] = "Two";
		rank[2] = "Three";
		rank[3] = "Four";
		rank[4] = "Five";
		rank[5] = "Six";
		rank[6] = "Seven";
		rank[7] = "Eight";
		rank[8] = "Nine";
		rank[9] = "Ten";
		rank[10] = "Jack";
		rank[11] = "Queen";
		rank[12] = "King";

		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck d = new Deck(rank, suit, pointValue);
		//d.printDeck();
		System.out.println("Is the deck empty? " + d.isEmpty());
		System.out.println("A Card has been dealt out: " + d.deal());
		System.out.println("Number of Cards left: " + d.size());
	}
}