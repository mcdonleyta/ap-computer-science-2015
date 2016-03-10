import java.util.List;
import java.util.ArrayList;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Jack","Queen","King","Ace"};
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		int[] values = {11,12,13,14};
		Deck Decker = new Deck(ranks, suits, values);
		System.out.println(Decker.size());
		System.out.println(Decker.deal());
		if(Decker.isEmpty())
		{
			System.out.println("1");
		}
		System.out.println(Decker.toString());
	}
}
