/**
 * This is a class that tests the Card class.
 */
import java.util.*;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		ArrayList<Card> cardList = new ArrayList<Card>();
		cardList.add(new Card("ace","spades",14));
		cardList.add(new Card(null,"hearts",2));
		cardList.add(new Card(null, "clubs", 8));
		cardList.add(new Card("jack","diamonds",11));
		Card one = new Card("ace","spades",14);
		System.out.println(cardList.get(0));
		System.out.println(one.matches(cardList.get(0)));
		System.out.println(one.matches(cardList.get(2)));
	}
}
