package com.poker;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * Hand
 * @author paulc
 *
 *
 * For now, a hand does not have any limit to the number of cards.  This is so that we can 
 * build multiple sizes and rank (sizes would typically range from 2 to 7)
 */
public class Hand  {
	
	ArrayList<Card> Cards = new ArrayList<Card>();
	private Rank flushRank = null;   				// Used to store the highest rank card in a flush

	Rank getFlushRank() {
		return flushRank;
	}
	
	void addCard(Card newCard) {
		Cards.add(newCard);
	}
	
	void sortByRank() {
		//Collections.sort(Cards);
		Collections.sort(Cards, new CardRankComparator());
	}
	
	void sortBySuit() {
		//Collections.sort(Cards);
		Collections.sort(Cards, new CardSuitComparator());
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Card c : Cards) {
			s.append(c.rank() + " of " + c.suit() +   "\r");
		}
		return s.toString();
	}
	
	int size() {
		return Cards.size();
	}
	
	boolean isFlush() {
		// TODO: Problem when flush is found and end of collection 
		this.sortBySuit();

		boolean flush = false;
		int suitCount = 0;
		int maxRank = 0;
		int thisSuit = 0;
		int thisRank = 0;
		for (Card c : Cards) {
			if (suitCount == 0) {
				thisSuit = c.suit().suit;
				suitCount++;
			}
			else if (thisSuit != c.suit().suit) {
				if (suitCount >= 5)  {
					if (thisRank > maxRank) maxRank = thisRank;
					flush = true;
				}
				suitCount = 0;
			}
			else  {
				suitCount++;
				thisRank = c.rank().rank;
			}
		}
		
		if ( suitCount >= 5 ) {
			if (thisRank > maxRank) maxRank = thisRank;
			flush = true;
		}
		
		return flush;
	}

}
