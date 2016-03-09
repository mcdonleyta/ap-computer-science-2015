package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"ace", "queen", "five"};
		String[] suits = {"diamonds", "spades", "hearts"};
		int[] values = {1, 12, 5};
		Deck d = new Deck(ranks, suits, values);
		System.out.println(d.size());
		System.out.println(d);
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.size());
		System.out.println(d);

		String[] ranks2 = {"four", "seven", "king"};
		String[] suits2 = {"spades", "clubs", "hearts"};
		int[] values2 = {4, 7, 13};
		d = new Deck(ranks2, suits2, values2);
		System.out.println(d.size());
		System.out.println(d);
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.size());
		System.out.println(d);

		String[] ranks3 = {"nine", "eight", "jack"};
		String[] suits3 = {"diamonds", "diamonds", "hearts"};
		int[] values3 = {1, 12, 5};
		d = new Deck(ranks3, suits3, values3);
		System.out.println(d.size());
		System.out.println(d);
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.size());
		System.out.println(d);
	}
}
