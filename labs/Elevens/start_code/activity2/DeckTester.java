/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		int[] values = {11,10,10,10,10,9,8,7,6,5,4,3,2,1};
		String[] suits = {"spades","hearts","diamonds","clubs"};
		String[] ranks = {"ace","king","queen","jack","10","9","8","7","6","5","4","3","2","1"};
		Deck workPls = new Deck(ranks,suits,values);
		//System.out.println(workPls);
		System.out.println("Is this deck Empty? " + workPls.isEmpty());
		System.out.println("Its size is " + workPls.size());
		System.out.println("The deck: ");
		System.out.println(workPls);
		System.out.println("I deal a " + workPls.deal());
		System.out.println("Now the size is " + workPls.size());
	}
}
