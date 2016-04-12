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
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
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
	public boolean isLegal(List<Integer> selectedCards) { //Mr. M: This function should return true only if
		for(Integer i: selectedCards) {               //  1) selectedCards.size() == 2 and containsPairSum11()
			if(cardAt(i.intValue()) == null)      //  2) OR selectedCards.size(0 == 3 and containsJQK()
				return false;
		}
		return containsJQK(selectedCards) || containsPairSum11(selectedCards);
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
	public boolean anotherPlayIsPossible() {     //Mr. M: This implements what should be in containPairSum11 and containsJQK
		List<Integer> hh = new ArrayList(0); 
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				hh.clear();
				hh.add(new Integer(i));
				hh.add(new Integer(j));
				if(containsPairSum11(hh))
					return true;
			}
		}                 
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				for(int	k = 0; k < BOARD_SIZE; k++) {
					hh.clear();
					hh.add(new Integer(i));
					hh.add(new Integer(j));
					hh.add(new Integer(k));
					if(containsJQK(hh))
						return true;
				}
			}
		}
	return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) { //Mr. M: This fuction doesn't assume selectedCards.size()==1
		if(selectedCards.size() != 2)                            // instead, it checks if any 2 cards can sum to 11
			return false;
		if(cardAt(selectedCards.get(0).intValue()).pointValue() + cardAt(selectedCards.get(1).intValue()).pointValue() == 11)
			return true;
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes intords. this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) { //Mr. M: See comment above
		if(selectedCards.size() != 3)
			return false;
		String s = "";
		for(int i = 0; i < 3; i++)
			s += cardAt(selectedCards.get(i).intValue()).rank();
		if(s.contains("jack") && s.contains("queen") && s.contains("king"))
			return true;
		return false;
	}
}
