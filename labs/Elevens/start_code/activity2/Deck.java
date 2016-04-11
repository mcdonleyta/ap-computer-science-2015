import java.util.List;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.*;
=======
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
<<<<<<< HEAD
		cards= new ArrayList<>();
		for(int i = 0; i<suits.length;i++) {
			for(int j = 0; j<ranks.length;j++) {
				cards.add(new Card(ranks[j],suits[i],values[j]));
			}
		}
		this.size = cards.size();
	}

=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}


>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
<<<<<<< HEAD
		return size == 0;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
<<<<<<< HEAD
		return this.size;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
<<<<<<< HEAD

		for(int i = 0 ; i <100; i++) {
			int randIndex = ((int)(Math.random() * cards.size()));
			int randElement = ((int)(Math.random() * cards.size()));
			cards.set(randIndex,cards.get(randElement));
		}
		size = cards.size();
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
<<<<<<< HEAD
		if(this.size() <= 0) {
			return null;
		}
		else {
			Card ret = cards.get(this.size-1);
			size--;
			return ret;
			
		}
		
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
