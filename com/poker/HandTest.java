package com.poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	@Test
	public void FlushShouldExist() {
		Hand hand = new Hand();
		hand.addCard(new Card(Rank.ACE, Suit.HEARTS));
		hand.addCard(new Card(Rank.TEN, Suit.HEARTS));
		hand.addCard(new Card(Rank.SEVEN, Suit.CLUBS));
		hand.addCard(new Card(Rank.SIX, Suit.HEARTS));
		hand.addCard(new Card(Rank.DEUCE, Suit.HEARTS));
		hand.addCard(new Card(Rank.KING, Suit.HEARTS));
		assertTrue(hand.isFlush());
	}
	
	@Test
	public void FlushShouldExist2() {
		Hand hand = new Hand();
		hand.addCard(new Card(Rank.ACE, Suit.SPADES));
		hand.addCard(new Card(Rank.TEN, Suit.SPADES));
		hand.addCard(new Card(Rank.SEVEN, Suit.CLUBS));
		hand.addCard(new Card(Rank.SEVEN, Suit.SPADES));
		hand.addCard(new Card(Rank.DEUCE, Suit.HEARTS));
		hand.addCard(new Card(Rank.KING, Suit.SPADES));
		hand.addCard(new Card(Rank.QUEEN, Suit.SPADES));
		hand.sortBySuit();
		System.out.print(hand);
		assertTrue(hand.isFlush());
	}

	@Test
	public void FlushShouldNotExist() {
		Hand hand = new Hand();
		hand.addCard(new Card(Rank.ACE, Suit.HEARTS));
		hand.addCard(new Card(Rank.TEN, Suit.CLUBS));
		hand.addCard(new Card(Rank.SEVEN, Suit.CLUBS));
		hand.addCard(new Card(Rank.SIX, Suit.HEARTS));
		hand.addCard(new Card(Rank.DEUCE, Suit.HEARTS));
		hand.addCard(new Card(Rank.KING, Suit.HEARTS));
		assertFalse(hand.isFlush());
	}
}
