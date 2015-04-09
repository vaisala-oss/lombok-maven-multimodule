package org.lombok.maven.multimodule.other;

import java.util.List;

import org.lombok.maven.multimodule.lomboklib.Card;

import com.google.common.collect.Lists;

import static org.lombok.maven.multimodule.lomboklib.Card.Rank.*;
import static org.lombok.maven.multimodule.lomboklib.Card.Suit.*;

public class CardDemo {

	public static void main(String[] args) {
		
		List<Card> hand = Lists.newArrayList(
				new Card(ACE, SPADES),
				new Card(DEUCE, CLUBS),
				new Card(QUEEN, HEARTS),
				new Card(KING, DIAMONDS),
				new Card(FIVE, CLUBS));
		
		Card first = hand.get(0);
		System.out.println("The first card of your hand is an "+first.getRank()+" of "+first.getSuit()+".");
		
		Card lookingFor = new Card(FIVE, CLUBS);
		if (hand.contains(lookingFor)) {
			System.out.println("Your hand contains a "+lookingFor);
		}
	}
}
