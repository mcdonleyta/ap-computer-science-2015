//Mr. M: 14/15

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
	public boolean isLegal(List<Integer> selectedCards) { //Mr. M: This function checks if the selected cards form a legal move
		boolean ret = false;                          //   so it returns true if 1) containsPairSum11() AND selectedCards.size() == 2
		                                              //   OR if 2) containsJQK and selectedCards.size() == 3
		if(containsPairSum11(selectedCards) == true || containsJQK(selectedCards) == true)
			ret = true;
		return ret;
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
	public boolean anotherPlayIsPossible() {                 //Mr. M: This duplicates the code/functionality from 
		List<Integer> cardIndexes = cardIndexes();       // containsPairSum11() and containsJQK()
		List<Integer> cardPossibilities = new ArrayList<Integer>();
		for(int i=0; i<cardIndexes.size(); i++){
			for(int j=i; j<cardIndexes.size(); j++){
				cardPossibilities.add(new Integer(i));
				cardPossibilities.add(new Integer(j));
				if(containsPairSum11(cardPossibilities))
					return true;
				else cardPossibilities.clear(); 
			}
		}
		
		for(int i=0; i<cardIndexes.size(); i++){
			for(int j=i; j<cardIndexes.size(); j++){
				for(int k=j; k<cardIndexes.size(); k++)
				{
					cardPossibilities.add(new Integer(i));
					cardPossibilities.add(new Integer(j));
					cardPossibilities.add(new Integer(k));
					if(containsJQK(cardPossibilities))
						return true;
					else cardPossibilities.clear(); 
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
	private boolean containsPairSum11(List<Integer> selectedCards) { //Mr.M This function does not assume the selectedCards.size() == 2
		boolean ret = false;                                     // instead it checks if ANY two cards in selected sum to 11
		if(selectedCards.size()==2){
			if(cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(1)).pointValue() == 11)
				ret = true;
		}
		return ret;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) { //MR. M: See comment above
		boolean ret = false;
		if(selectedCards.size()==3){
			if(cardAt(selectedCards.get(0)).pointValue() == 0 && cardAt(selectedCards.get(1)).pointValue() == 0 && cardAt(selectedCards.get(2)).pointValue() == 0){
				if(cardAt(selectedCards.get(0)).suit() != cardAt(selectedCards.get(1)).suit() && cardAt(selectedCards.get(1)).suit() != cardAt(selectedCards.get(2)).suit()){
					ret = true;
				}
			}		
		}
		return ret;
	}
}
