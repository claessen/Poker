package com.poker;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class DeckTest {

	@Test
	public void ADeckShouldHave52Cards() {
		Deck d = new Deck();
		Hand h = new Hand();
		
		while (d.hasNext()) {
			h.addCard(d.getCard());
		}
		
		assertEquals(h.size(),52);
	}
	
	
	@Test
	public void ADeckShouldHave12CardsOfEachSuit() {
		Deck d = new Deck();
		HashMap<Suit, Integer> suitcount = new HashMap<Suit, Integer>();
		
		while (d.hasNext()) {
			Card c = d.getCard();
			if (suitcount.containsKey(c.suit())) {
				suitcount.put(c.suit(), suitcount.get(c.suit()) + 1);
			}
			else {
			  suitcount.put(c.suit(),1);
		    }
		}
		
		boolean ThirteenCards = true;
		
		for (Map.Entry<Suit, Integer> entry : suitcount.entrySet() ) {
			Suit key =  entry.getKey();
			Integer count = entry.getValue();
			if (count != 13) ThirteenCards = false;
			
		}
		assertTrue(ThirteenCards);
		
	}
	
}

		