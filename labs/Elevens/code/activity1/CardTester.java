/**
 * This is a class that tests the Card class.
 */

import java.util.ArrayList;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */

	public static void main(String[] args) 
	{
		ArrayList <Card> deck = new ArrayList <Card> ();
		String h = "Heart", d = "Diamond", c = "Clubs", s = "Spades";

		/*for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 13; j++)
			{
				if(i == 1)
				{
					deck.add(new Card(h, , j));
				}else
				if(i == 2)
				{
					deck.add(new Card(d, , j));
				}else
				if(i == 3)
				{
					deck.add(new Card(c, , j));
				}else
				if(i == 4)
				{
					deck.add(new Card(s, , j));
				}
			}
		}*/

		Card test = new Card(h, "Two", 2);
		System.out.println(test.rank() + " " + test.suit() + " " + test.pointValue());
		Card test2 = new Card(h, "Two", 2);
		System.out.println(test2.rank() + " " + test2.suit() + " " + test2.pointValue());
		System.out.println("Equal? " + test.matches(test2));
		System.out.println(test.toString());
	}
}
