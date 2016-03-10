/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		String tester;
		Card test = new Card("five","hearts",5);
		Card test2 = new Card("five","hearts",5);
		tester = test.toString();
		System.out.println(tester);
		if(test.matches(test2))
		{
			System.out.print("1");
		}
	}
}
