package com.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> Deck = new ArrayList<Card>();
	
	Deck() {
		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				Card c = new Card(r, s);
				Deck.add(c);
			}
		}
	}
	
	public Card getCard() {
		if (Deck.size() == 0) return null;
		Collections.shuffle(Deck);
		Card c = Deck.get(0);
		Deck.remove(0);
		return (c);
	}
	
	public boolean hasNext() {
		if (Deck.size() >0) return true;
		return false;
	}
	
	
	public String toString() {
		StringBuilder cards = new StringBuilder();
		for (Card c : Deck) {
			cards.append(c.toString() + " ");
		}
		return cards.toString();
	}
}
