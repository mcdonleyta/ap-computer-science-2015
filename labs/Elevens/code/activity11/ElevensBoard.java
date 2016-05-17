import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

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
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() 
	 {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
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
			if(findPairSum11(selectedCards).size() == 2)
			{
				r = true;
			}
		}else
		if (selectedCards.size() == 3) 
		{
			if(findJQK(selectedCards).size() == 3)
			{
				r = true;
			}
		}

		return r;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() 
	{
		List<Integer> cIndexes = cardIndexes();
		boolean r = false;

		if(findJQK(cIndexes).size() == 3)
		{
			r = true;
		}else
		if(findPairSum11(cIndexes).size() == 2)
		{
			r = true;
		}

		return r;
	}

	/**
	 * Look for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return a list of the indexes of an 11-pair, if an 11-pair was found;
	 *         an empty list, if an 11-pair was not found.
	 */
	/*private boolean containsPairSum11(List<Integer> selectedCards) 
	{
		/* *** TO BE CHANGED INTO findPairSum11 IN ACTIVITY 11 *** *
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) 
		{
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) 
			{
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 11) 
				{
					return true;
				}
			}
		}
		return false;
	}*/

	private List<Integer> findPairSum11(List<Integer> selectedCards)
	{
		List<Integer> values = new ArrayList<Integer> ();

		for(int i = 0; i < selectedCards.size(); i++)
		{
			int one = selectedCards.get(i).intValue();
			for(int j = i + 1; j < selectedCards.size(); j++)
			{
				int two = selectedCards.get(i).intValue();

				if(cardAt(one).pointValue() + cardAt(two).pointValue() == 11)
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
	 * Look for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return a list of the indexes of a JQK, if a JQK was found;
	 *         an empty list, if a JQK was not found.
	 */

	/*private boolean containsJQK(List<Integer> selectedCards) 
	{
		/* *** TO BE CHANGED INTO findJQK IN ACTIVITY 11 *** *
		boolean foundJack = false;
		boolean foundQueen = false;
		boolean foundKing = false;
		for (Integer kObj : selectedCards) {
			int k = kObj.intValue();
			if (cardAt(k).rank().equals("jack")) {
				foundJack = true;
			} else if (cardAt(k).rank().equals("queen")) {
				foundQueen = true;
			} else if (cardAt(k).rank().equals("king")) {
				foundKing = true;
			}
		}
		return foundJack && foundQueen && foundKing;
	}*/

	private List<Integer> findJQK(List<Integer> selectedCards)
	{
		List<Integer> values = new ArrayList<Integer>();
		boolean jack = false;
		boolean queen = false;
		boolean king = false;
		int iJack = 0;
		int iQueen = 0;
		int iKing = 0;
		
		for(int i = 0; i < selectedCards.size(); i++)
		{
			int k = selectedCards.get(i).intValue();

			if(cardAt(k).rank().equals("jack"))
			{
				jack = true;
				iJack = k;
			}else
			if(cardAt(k).rank().equals("queen"))
			{
				queen = true;
				iQueen = k;
			}else
			if(cardAt(k).rank().equals("king"))
			{
				king = true;
				iKing = k;
			}

			if(king == true && queen == true && jack == true)
			{
				values.add(iKing);
				values.add(iJack);
				values.add(iQueen);

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
		if(playPairSum11IfPossible() == true)
		{
			return playPairSum11IfPossible();
		}else
		if(playJQKIfPossible() == true)
		{
			return playJQKIfPossible();
		}else
		{
			return false;
		}
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 11.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 11-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum11IfPossible() 
	{
		List <Integer> list = findPairSum11(cardIndexes());
		boolean r = false;

		if(list.size() == 2)
		{
			replaceSelectedCards(list);
			r = true;
		}

		return r;
	}

	/**
	 * Looks for a group of three face cards JQK.
	 * If found, replace them with the next three cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a JQK play was found (and made); false othewise.
	 */
	private boolean playJQKIfPossible() 
	{
		List <Integer> list = findJQK(cardIndexes());
		boolean r = false;

		if(list.size() == 3)
		{
			replaceSelectedCards(list);
			r = true;
		}

		return r; 
	}
}