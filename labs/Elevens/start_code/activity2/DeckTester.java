/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		int[] values = {4,6,2};
		String[] suits = {"spades","hearts","clubs"};
		String[] ranks = {"ace", "king", "queen"};
		Deck workPls = new Deck(ranks,suits,values);
		System.out.println("Is this deck Empty? " + workPls.isEmpty());
		System.out.println("Its size is " + workPls.size());
		System.out.println("I deal a " + workPls.deal());
		System.out.println("Now the size is " + workPls.size());
	}
}
