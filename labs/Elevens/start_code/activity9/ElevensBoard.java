//Mr. M: 14/15 Make sure to implement the function based closely on the specifications and pre/post-conditions

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
	public boolean isLegal(List<Integer> selectedCards) {

		return containsPairSum11(selectedCards) || (containsJQK(selectedCards));   //MR. M: This is the code for anotherPlayIsPossible()
		}                                                                          //We need to check containsPair or JQK based on how many cards are selected (2 or 3)

		
	


	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {  //Mr. M: This code can be simplified by calling containsSum11 and containsJQK
		ArrayList<Integer> selectedCards = new ArrayList<Integer>(); 
		for(int i = 0; i<BOARD_SIZE; i++) {
			for(int j = 0; j<BOARD_SIZE;j++) {
				selectedCards.clear(); //terrible solution but it works
				selectedCards.add(i);
				selectedCards.add(j);
				if(containsPairSum11(selectedCards))
					return true;
			}
		}
		ArrayList<Integer> selectedCardsTwo = new ArrayList<Integer>();
		for(int k = 0; k<BOARD_SIZE; k++) {
			for(int l = 0; l<BOARD_SIZE; l++) {
				for(int m = 0; m<BOARD_SIZE;m++) {
					selectedCardsTwo.clear(); 
					selectedCardsTwo.add(k);
					selectedCardsTwo.add(l);
					selectedCardsTwo.add(m);
				if(containsJQK(selectedCards))
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
	private boolean containsPairSum11(List<Integer> selectedCards) { //Mr. M: This function finds if a pair exists in the selection not if
                                                                         // all the selectedCards sum to 11
		int sum=0;
		if(selectedCards.size() != 2) {
			return false;
		}
		for(Integer e:selectedCards) {
			Card tmp = cardAt(e);
			if (tmp == null) 
				return false;
			sum += tmp.pointValue();
		}
		if(sum == 11) {
			return true;
		}
		return false;

	}


	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) { //MR. M: This function need only scan the selected cards
                                                                   // and make sure it has at least 1 J, Q, and K
		int sum=0;
		if(selectedCards.size()!=3)
			return false;
		for(Integer e:selectedCards) {
			Card tmp = cardAt(e);
			if(e==null) 
				return false;
			sum += tmp.pointValue();
		}
		if(sum == 0) {
			return true;
		}

		return false;

	}
}