/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
<<<<<<< HEAD

=======
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
<<<<<<< HEAD
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
<<<<<<< HEAD
		return suit;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String rank() {
<<<<<<< HEAD
		return rank;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
<<<<<<< HEAD
		return pointValue;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
<<<<<<< HEAD
		if(otherCard.pointValue() == this.pointValue && otherCard.rank().equals(this.rank) && otherCard.suit().equals(this.suit)) {
			return true;
		}
		else 
			return false;
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
<<<<<<< HEAD
		return (this.rank + " of " + this.suit + "(point value = " + this.pointValue + " )");
=======
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
	}
}
