/**
 * This is a class that tests the Card class.
 */

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card testThis = new Card("Ace","Spades",1);
		Card testCompTrue = new Card("Ace","Spades",1);
		Card testCompFalse = new Card("King","Hearts",10);
		System.out.println("value is " + testThis.pointValue());
		System.out.println("rank is " + testThis.rank());
		System.out.println("suit is " + testThis.suit());
		System.out.println("It is "+ testThis.matches(testCompTrue) +" that testThis matches testCompTrue");
		System.out.println("It is "+ testThis.matches(testCompFalse) +" that testThis matches testCompFalse");
		
	}
}
