import java.util.List;
import java.util.ArrayList;

/**
 * The ThirteensBoard class represents the board in a game of Thirteens.
 */
public class ThirteensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 10;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	/**
	 * Creates a new <code>ThirteensBoard</code> instance.
	 */
	 public ThirteensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Thirteens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 13, and (2) a king.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) 
	{
		boolean r = false;

		if (selectedCards.size() == 2) 
		{
			if(findPairSum13(selectedCards).size() == 2)
			{
				r = true;
			}
		}else
		if (selectedCards.size() == 3) 
		{
			if(findKing(selectedCards).size() == 3)
			{
				r = true;
			}
		}

		return r;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Thirteens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 13, or (2) a king.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() 
	{
		List<Integer> cIndexes = cardIndexes();
		boolean r = false;

		if(findKing(cIndexes).size() == 3)
		{
			r = true;
		}else
		if(findPairSum13(cIndexes).size() == 2)
		{
			r = true;
		}

		return r;
	}

	/**
	 * Look for an 13-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 13-pair.
	 * @return a list of the indexes of an 13-pair, if an 13-pair was found;
	 *         an empty list, if an 13-pair was not found.
	 */
	/*private boolean containsPairSum13(List<Integer> selectedCards) 
	{
		/* *** TO BE CHANGED INTO findPairSum13 IN ACTIVITY 11 *** *
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) 
		{
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) 
			{
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 13) 
				{
					return true;
				}
			}
		}

		return false;
	}*/

	private List<Integer> findPairSum13(List<Integer> selectedCards)
	{
		List<Integer> values = new ArrayList<Integer> ();

		for(int i = 0; i < selectedCards.size(); i++)
		{
			int one = selectedCards.get(i).intValue();
			
			for(int j = i + 1; j < selectedCards.size(); j++)
			{
				int two = selectedCards.get(i).intValue();

				if(cardAt(one).pointValue() + cardAt(two).pointValue() == 13)
				{
					values.add(one);
					values.add(two);
				}

				if(values.size() == 2)
				{
					break;
				}
			}

			if(values.size() == 2)
			{
				break;
			}
		}

		return values;
	}

	/**
	 * Look for a king in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a king.
	 * @return a list of the index of a king, if a king was found;
	 *         an empty list, if a king was not found.
	 */

	/*private boolean containsKing(List<Integer> selectedCards) 
	{
		/* *** TO BE CHANGED INTO findKing IN ACTIVITY 11 *** *
		for (Integer kObj : selectedCards) 
		{
			int k = kObj.intValue();
			if (cardAt(k).rank().equals("king")) {
				return true;
			}
		}
		return false;
	}*/

	private List<Integer> findKing(List<Integer> selectedCards)
	{
		List<Integer> values = new ArrayList<Integer>();
		boolean king = false;
		int iKing = 0;
		
		for(int i = 0; i < selectedCards.size(); i++)
		{
			int k = selectedCards.get(i).intValue();

			if(cardAt(k).rank().equals("king"))
			{
				king = true;
				iKing = k;
			}

			if(king == true)
			{
				values.add(iKing);
				break;
			}
		}

		return values;
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() 
	{
		if(playPairSum13IfPossible() == true)
		{
			return playPairSum13IfPossible();
		}else
		if(playKingIfPossible() == true)
		{
			return playKingIfPossible();
		}else
		{
			return false;
		}
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 13.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 13-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum13IfPossible() 
	{
		List <Integer> list = findPairSum13(cardIndexes());
		boolean r = false;

		if(list.size() == 2)
		{
			replaceSelectedCards(list);
			r = true;
		}

		return r;
	}

	/**
	 * Looks for a King.
	 * If found, replace it with the next card in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a king play was found (and made); false othewise.
	 */
	private boolean playKingIfPossible() 
	{
		List <Integer> list = findKing(cardIndexes());
		boolean r = false;

		if(list.size() == 1)
		{
			replaceSelectedCards(list);
			r = true;
		}

		return r; 
	}
}