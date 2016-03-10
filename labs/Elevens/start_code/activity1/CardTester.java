/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Jack", "Spades", 10);
		Card b = new Card("Ace", "Diamonds", 1);
		Card c = new Card("Jack", "Spades", 10);
		System.out.println("The three cards are:\n	" + 
					a.toString() + "\n	" +
					b.toString() + "\n	" + 
					c.toString());
		if (a.matches(b) || a.matches(c) || b.matches(c))
			System.out.println("At least two of the cards are the same");
		else
			System.out.println("None of the cards are the same");
	}
}
