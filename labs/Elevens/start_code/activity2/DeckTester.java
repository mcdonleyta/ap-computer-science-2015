/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r = {"Jack", "3", "Ace", "2", "9"};
		String[] s = {"Diamonds", "Hearts", "Hearts", "Clubs", "Diamonds"};
		int[] v = {10, 3, 11, 2, 9};
		Deck d = new Deck(r, s, v);
		System.out.println(d.toString());
		System.out.println("You get a: " + d.deal().toString() + "\n" +
					"You also get a: " + d.deal().toString() + "\n");
		System.out.println(d.toString());
	}
}
