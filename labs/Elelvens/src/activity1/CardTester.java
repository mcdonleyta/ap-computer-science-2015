package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = new Card[4];
		cards[0] = new Card("ace", "hearts", 1);
		cards[1] = new Card("5", "diamonds", 5);
		cards[2] = new Card("queen", "spades", 12);
		cards[3] = new Card("ace", "hearts", 1);
		System.out.println(cards[0].matches(cards[3]));
		System.out.println(cards[0].matches(cards[2]));
		for(Card card : cards)
			System.out.println(card);
	}
}
