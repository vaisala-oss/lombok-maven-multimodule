package org.lombok.maven.multimodule.lomboklib;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * A 52 card deck <i>playing card</i>.
 */
@Data
@AllArgsConstructor
public class Card {
	
	public static enum Rank { DEUCE, THREE, FOUR, FIVE, SIX,
		SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }

	public static enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
	
	// the field comments are copied to the getters and setters.
	/**
	 * {@code Rank} gives a numeric value to a {@code Card}.
	 */
	private Rank rank;
	
	/**
	 * {@code Suit} provides a way to group cards, and a secondary valuation.
	 */
	private Suit suit;
}
